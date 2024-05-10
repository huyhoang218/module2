import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {1, 56, 4, -4, 6, 4, 73, 4};
        System.out.print("Nhập phần tử muốn xóa: ");
        int x = input.nextInt();
        // Đếm số lượng phần tử cùng giá trị với phần tử xóa
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int index = 0;
        // Xóa các phần tử
        for (int i = 0; i < array.length; i++) {
            if(x != array[i]) {
                newArray[index] = array[i];
                index++;
            }
        }
        // in ra mảng mới
        System.out.println(Arrays.toString(newArray));
    }
}
