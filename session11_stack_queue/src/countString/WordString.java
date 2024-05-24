package countString;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.TreeMap;

public class WordString {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        System.out.println(str);

    }

}
