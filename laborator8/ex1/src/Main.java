import jdbc.model.Student;
import jdbc.model.StudentRepository;
import producerconsumer.ProducerConsumerTask;
import threads0.RunnableTask;
import threads0.ThreadTask;
import threads1.Task;
import threads1.TaskExecutor;

import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException, SQLException {

        // clasa Thread
        // interfata Runnable

//        ThreadTask task = new ThreadTask();
//        task.start();
//        task.join();
//        RunnableTask runnableTask = new RunnableTask();
//        runnableTask.run();


//        Task task = new Task();
//        TaskExecutor taskExecutor1 = new TaskExecutor(task);
//        TaskExecutor taskExecutor2 = new TaskExecutor(task);
//
//        taskExecutor1.start();
////        taskExecutor1.join();
//        taskExecutor2.start();
//
//
//        ProducerConsumerTask pc = new ProducerConsumerTask();
//        Thread t1 = new Thread(() -> {
//            try {
//                pc.produce();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            try {
//                pc.consume();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        t1.start();
//        t2.start();

        //Executor Service
        //Fork Join

        StudentRepository studentRepository =  new StudentRepository();

//        Student s1 = new Student("S1", "N1", "8");
//        Student s2 = new Student("S2", "N2", "7");
//
//        studentRepository.addStudent(s1);
//        studentRepository.addStudent(s2);

        System.out.println(studentRepository.retrieveStudents());
        studentRepository.deleteStudent(2);
        System.out.println(studentRepository.retrieveStudents());

    }
}
