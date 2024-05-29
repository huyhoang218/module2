package sumNumberInFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }
}
