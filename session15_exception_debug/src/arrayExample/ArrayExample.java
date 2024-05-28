package arrayExample;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[10];
        System.out.println("Danh sách các phần tử trong mảng");
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số phần tử cần tìm: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Giá trị của phần tử ở vị trí " + index + " là " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
           }
}
