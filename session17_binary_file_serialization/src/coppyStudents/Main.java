package coppyStudents;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hoang", "Hanoi"));
        students.add(new Student(2, "Dao", "NamDinh"));
        students.add(new Student(3, "Huy", "HCM"));
        writeDataToFile("sourceFile.txt", students);

        List<Student> studentDataFromFile = readDataToFile("sourceFile.txt");

        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static void writeDataToFile(String path, List<Student> students) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);

            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataToFile(String path) {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ko tìm thấy file");
        } catch (IOException e) {
            System.err.println("Lỗi đọc ghi file");
        } catch (ClassNotFoundException e) {
            System.err.println("Ko tìm thấy class");
        }
        return students;
    }
}
