package coppyFile;

import java.io.*;
import java.util.Scanner;

public class CoppyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn của tệp nguồn: ");
        String sourceFilePath = scanner.nextLine();
        File sourceFile = new File(sourceFilePath);

        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Tệp nguồn không tồn tại hoặc không hợp lệ.");
            return;
        }

        System.out.print("Nhập đường dẫn của tệp đích: ");
        String targetFilePath = scanner.nextLine();
        File targetFile = new File(targetFilePath);

        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại.");
            return;
        }
        //coppy theo dòng
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            BufferedReader br= new BufferedReader(new FileReader(sourceFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // coppy theo ký tự

//        try (FileReader fileReader = new FileReader(sourceFile);
//             FileWriter fileWriter = new FileWriter(targetFile)) {
//
//            int charCount = 0;
//            int character;
//            while ((character = fileReader.read()) != -1) {
//                fileWriter.write(character);
//                charCount++;
//            }
//
//            System.out.println("Đã sao chép thành công. Số ký tự trong tệp: " + charCount);
//
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi trong quá trình sao chép tệp: " + e.getMessage());
//        }
    }
}
