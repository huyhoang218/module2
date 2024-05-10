import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arrayFirst = new int[5];
        System.out.println("Enter array 1: ");
        inputElement(arrayFirst);
        System.out.println("Enter array 2: ");
        int[] arrayLast = new int[4];
        inputElement(arrayLast);

        int length = arrayFirst.length + arrayLast.length;
        int[] array = new int[length];

        for (int i = 0; i < arrayFirst.length; i++) {
            array[i] = arrayFirst[i];
        }
        int j = 0;
        for (int i = arrayFirst.length; i < length; i++) {
            array[i] = arrayLast[j];
            j++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void inputElement(int[] array) {
        Scanner input = new Scanner(System.in);
        int element;
        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + " = ");
            element = input.nextInt();
            array[i] = element;
        }
    }
}
