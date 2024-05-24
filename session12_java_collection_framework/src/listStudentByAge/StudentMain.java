package listStudentByAge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang", 18, "Hn");
        Student student2 = new Student("Huy", 19, "Hn");
        Student student3 = new Student("Dao", 17, "Hn");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);


        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
