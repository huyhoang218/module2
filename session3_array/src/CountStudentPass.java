import java.util.Scanner;
public class CountStudentPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number students : ");
            number = input.nextInt();
        }while (number <= 0 || number > 30);

        int grades;
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter grades student " + i + ": ");
                grades = input.nextInt();
            }while (grades < 0 || grades > 10);
            array[i] = grades;
        }

        int count = 0;
        for (int i = 0; i < number; i++) {
            if (array[i] >= 5)
                count++;
        }

        System.out.println("Number student pass is: " + count);
    }
}
