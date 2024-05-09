import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberAsset;
        do {
            System.out.print("Nhập số lượng tài sản (không quá 20): ");
            numberAsset = input.nextShort();
        } while (numberAsset > 20 || numberAsset <= 0);

        int[] assets = new int[numberAsset];
        for (int i = 0; i < numberAsset; i++) {
            System.out.print("Tài sản " + i + " = ");
            assets[i] = input.nextInt();
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < assets.length; i++) {
            if (max < assets[i]) {
                max = assets[i];
                index = i + 1;
            }
        }

        System.out.println(max + " " + index);
    }
}
