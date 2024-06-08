package mvc_student.repositories;

import mvc_student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final String SRC_STUDENT = "C:\\codegym\\module2\\session\\mvc\\src\\mvc_student\\data\\students.csv";
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(21, "Hoang", "Nam Dinh", "C03"));
        students.add(new Student(8, "Dao", "Ha Noi", "C03"));
        students.add(new Student(2000, "Huy", "HCM", "C03"));
    }

    public void addStudent(Student student) {
        students.add(student);
        writeFile(students, false);
    }

    public List<Student> getAll() {
        return new ArrayList<>(students);
    }

    private void readStudent() {
        File file = new File(SRC_STUDENT);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                students.add(new Student(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tìm thấy");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
    }

    private void writeFile(List<Student> students, boolean append) {
        File file = new File(SRC_STUDENT);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for(Student temp : students) {
                bufferedWriter.write(StudentRepository.this.toString(temp));
                bufferedWriter.newLine();
            }
        } catch(IOException e) {
            System.err.println("Lỗi ghi file");
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == student.getCode()) {
                students.remove(i);
                break;
            }
        }
        writeFile(students, false);
    }

    public Student searchByCode(int code) {
        for (Student student : students) {
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void editStudent(Student student) {
        Student newStudent;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == student.getCode()) {
                newStudent = students.get(i);
                newStudent.setName(student.getName());
                newStudent.setAddress(student.getAddress());
                newStudent.setClassRoom(student.getClassRoom());
                break;
            }
        }

        writeFile(students, false);
    }

    private String toString(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getAddress() + "," + student.getClassRoom();
    }
}
