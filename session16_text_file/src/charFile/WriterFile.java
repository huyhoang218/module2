package charFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) throws IOException {
        String string = "Baby, take my hand " +
                "I want you to be my husband";

        FileWriter output = new FileWriter("output.text");
        for (int i = 0; i < string.length(); i++) {
            output.write(string.charAt(i));
        }
        System.out.println("Done");
        output.close();
    }
}