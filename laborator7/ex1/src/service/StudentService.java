package service;

import exceptions.StudentNotFoundException;
import model.Student;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        Path filePath = Paths.get("C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\laboratorpao2022\\laborator7\\ex1\\src\\data\\students");
//        Scanner sc = null;
//        try {
//             sc = new Scanner(filePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sc.close();
//        }

        try(Scanner sc = new Scanner(filePath)){
            while (sc.hasNext()){
                String fileLine =  sc.next();
                String [] studentArray =  fileLine.split(",");
                Student student =  new Student(
                  Integer.parseInt(studentArray[0]),
                  studentArray[1],
                  studentArray[2],
                  Integer.parseInt(studentArray[3])
                );
                students.add(student);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student studentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with name " + name + " does not exist!!!"));
    }

    public List<Student> sortedStudentsByMark(){
//        Comparator<Student> studentComparator = (s1,s2) -> {
//            if(s1.getMark() > s2.getMark()){
//                return 1;
//            }else if(s1.getMark() < s2.getMark()){
//                return -1;
//            }else {
//                return 0;
//            }
//        };
        return students.stream()
                .sorted(Comparator.comparing(Student::getMark))
                .collect(Collectors.toList());
    }
}
