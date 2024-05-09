import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight of you is: ");
        float weight = input.nextFloat();

        System.out.print("Height of you is: ");
        float height = input.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25.0) {
            System.out.println("normal");
        } else if (bmi < 30.0) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
}
