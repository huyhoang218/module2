import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {1,2,4,3};
        int length = array.length;
        bubbleSort(array, length);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array, int length) {
        boolean needNextPass = true;
        int count = 0;
        int swap = 0;
        for (int i = 0; i < length - 1 && needNextPass; i++) {
            count++;
            needNextPass = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        System.out.println("loop " + count);
        System.out.println("swap: " + swap);
    }

}
