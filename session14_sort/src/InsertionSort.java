import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,8,7};
        int length = array.length;
        insertionSort(array, length);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array, int length) {
        int pos;
        int x;
        int count = 0;
        for (int i = 1; i < length; i++) {
            count++;
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(count);
    }
}
