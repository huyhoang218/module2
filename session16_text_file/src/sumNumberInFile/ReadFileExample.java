package sumNumberInFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.print("Sum = " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc không có nội dung");
        }
    }
}
