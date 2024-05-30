package session8_cleancode.mvc.repositories;

import session8_cleancode.mvc.models.Student;

import java.io.*;
import java.util.*;

public class StudentRepository {
    private static final String SRC_STUDENT = "src/session8_cleancode/mvc/data/students.csv";
    //    private static Student[] students = new Student[100];
//    up casting
//    Generic
    private static List<Student> students = new LinkedList<>();

    static {
        students.add(new Student(1, "HaiTT", "Quảng Nam", "C1123G1"));
    }

    public void add(Student student) {
        List<Student> students = new LinkedList<>();
        students.add(student);
        writeFile(students, true);


    }

    public List<Student> getAll() {
        List<Student> students = new LinkedList<>();
        File file = new File(SRC_STUDENT);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                students.add(new Student(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khômng tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        } finally {
            if( br !=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
    }
        return students;
    }

    public Student findByCode(int code) {
        List<Student> students = getAll();
        for (Student student : students) {
            if(student == null) {
                return null;
            }
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        List<Student> students = getAll();
        int size = students.size();
        for(int i = 0; i < size; i++) {
            if(students.get(i).getCode() == (student.getCode())) {
                students.remove(i);
                break;
            }
        }

        writeFile(students, false);

    }

    private void writeFile(List<Student> students, boolean append) {
        File file = new File(SRC_STUDENT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(Student temp: students) {
                bufferedWriter.write(toString(temp));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            if(bufferedWriter !=null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
    }

    private String toString(Student student) {
        // 1,haiTT,Quảng Nam,C03
        return student.getCode()+","+student.getName()+","+student.getAddress()+","+ student.getClassroom();
    }
}
