import exceptions.StudentNotFoundException;
import service.StudentService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * exceptii checked (aici ne atentioneaza compilatorul e.g:FileNotFoundException, SqlException)
         * exceptii unchecked (e.g NullPointerException)
         */

        // pana in java 8
        //        try{
        //
        //        }catch (Exception e){
        //
        //        }finally {
        //
        //        }

        //din java 8
        //resursa folosita trb sa implementeze interfata cloaseble
        // face management automat pe resurse
        //        try(resursa){
        //
        //        }catch (Exception e) {
        //
        //        }

        /**
         * throw => aruncam o exceptie
         * throws => propagam exceptia la nivelul urmator
         */

//        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l2 = new LinkedList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(4);
//
//        /**
//         * setul nu admite duplicate
//         *
//         */
//        Set<Integer> s1 = new HashSet<>();
//        Set<Integer> s2 = new LinkedHashSet<>();
//        /**
//         * set sortat
//         */
//        Set<Integer> s3 = new TreeSet<>();
//        SortedSet<Integer> s4 = new TreeSet<>();
//
//        /**
//         * colectii particulare
//         */
//        Map<String, String> m1 = new HashMap<>();
//        m1.put("a","b");
//        System.out.println(m1.get("a"));
//        System.out.println(m1);
//        Map<String, String> m2 = new TreeMap<>();


        StudentService studentService =  new StudentService();
//        System.out.println(studentService.sortedStudentsByMark());
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose one of the following options: ");
        System.out.println("1.List all students");
        System.out.println("2.List sorted students by mark");
        System.out.println("3.Find student by name");
        System.out.println("0.Exit application!!!");
        while (true) {
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("0")) {
                break;
            }

            switch (option) {
                case "1": {
                    System.out.println(studentService.getStudents());
                    break;
                }
                case "2" : {
                    System.out.println(studentService.sortedStudentsByMark());
                    break;
                }
                case "3" :{
                    System.out.println("Enter student name:");
                    String name = sc.nextLine();
                    try{
                        System.out.println(studentService.studentByName(name));
                    }catch (StudentNotFoundException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                }
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Enter another option!!!!");
        }


    }

//    public static SortedSet<Integer> m1() {
//        /**
//         * ......
//         */
//        return new TreeSet<>();
//    }
}
