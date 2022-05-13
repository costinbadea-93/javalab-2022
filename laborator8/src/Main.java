import model.Student;
import service.FileService;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
//        fileService.read0();
//        fileService.read1();
//        fileService.write1();
//        fileService.read2();
//        fileService.write2();
//        fileService.read4();
//        fileService.read5();
//        fileService.write5();
        Student student = new Student(1, "Ionut", 9);
//        fileService.writeObjectToFile(student);
        System.out.println(fileService.readObjectFromFile());
    }
}
