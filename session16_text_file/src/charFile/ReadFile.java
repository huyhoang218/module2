package charFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        int character;
        FileReader input = null;
        try {
            input = new FileReader("output.text");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

        while ((character = input.read()) != -1) {
            System.out.print((char) character);
        }
        input.close();
    }
}
