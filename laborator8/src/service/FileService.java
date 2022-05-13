package service;

import model.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileService {
    private File file = new File("C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\laboratorpao2022\\laborator8\\src\\data\\data.txt");

    public void read0() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void read1() {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            System.out.println(new String(fileInputStream.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write1() {
        String dataLine = "\nnew Content";
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write(dataLine.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read2() {
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void write2() {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(68);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read3() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            int index = -1;
            while ((index = bufferedInputStream.read()) != -1) {
                System.out.println((char) index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write3() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            bufferedOutputStream.write("\nsome new content".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read4() {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            int index = -1;
            while ((index = randomAccessFile.read()) != -1) {
                System.out.println((char) index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read5() {
        Path path = Paths.get(file.getPath());
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write5() {
        Path path = Paths.get(file.getPath());
        try {
            Files.writeString(path, "\nsomething newwww", APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeObjectToFile(Student student) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readObjectFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Student) objectInputStream.readObject();
        } catch (IOException| ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
