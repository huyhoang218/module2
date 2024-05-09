import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        do {
            System.out.println("Enter length of array");
            length = input.nextInt();
        } while (length > 20);

        int[] array = new int[length];
        int element;

        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + " = ");
            element = input.nextInt();
            array[i] = element;
        }

        displayArray(array);
        reverse(array);
        System.out.println("After reverse");
        displayArray(array);
    }

    //[1,2,3,4,5,6,7]
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
