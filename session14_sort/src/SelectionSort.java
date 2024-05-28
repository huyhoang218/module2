import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] array = {5, 2, 5, 3, -3, 45, 2, 1, 7};
        int[] array = {1,2,3,5,4};
        int length = array.length;
        selectionSort(array, length);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array, int length) {
        int min;
        int count = 0;
        int swap = 0;
        for (int i = 0; i < length - 1; i++) {
            count++;
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap++;
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(count);
        System.out.println("swap: " + swap);
    }
}
