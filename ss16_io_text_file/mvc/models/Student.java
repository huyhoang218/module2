package session8_cleancode.mvc.models;

import java.util.Objects;

public class Student extends Person {
    private String classroom;

    public Student() {
    }

    public Student(int code, String name, String address, String classroom) {
        super(code, name, address);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(classroom, student.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(classroom);
    }

//    @Override
//    public int compareTo(Student o) {
//        return (this.getName().compareTo(o.getName()));
//      if(this.point < o.point) {
//          return 1;
//      }
//    }
}
