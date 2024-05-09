import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"dao", "huy", "hoang", "dep", "trai"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name student: ");
        String name = input.nextLine();

        boolean find = false;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                find = true;
                System.out.println(name + " pos " + i);
            }
        }

        if (!find)
            System.out.println("not find student " + name);
    }
}
