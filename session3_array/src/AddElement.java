import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        //Nhập độ dài mảng
        do {
            System.out.print("Enter length of array: ");
            length = input.nextInt();
        } while (length <= 0);

        int[] array = new int[length];
        //Nhập phần tử trong mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("element " + i + " = ");
            array[i] = input.nextInt();
        }

        System.out.print("Add element: ");
        int add = input.nextInt();
        System.out.print("Index: ");
        int index = input.nextInt();

        if (index <= -1 || index >= (array.length - 1)) {
            System.out.println("Không chèn được vào mảng");
        } else {
            add(array, add, index);
        }
    }

    public static void add(int[] array, int add, int index) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = add;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
