import java.util.ArrayList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.nextLine();
        int length = string.length();

        ArrayList<Character> listMax = new ArrayList<>();
        ArrayList<Character> listTemp;

        for (int i = 0; i < length; i++) {
            listTemp = new ArrayList<>();
            listTemp.add(string.charAt(i));

            for (int j = i + 1; j < length; j++) {
                if (string.charAt(j) > listTemp.get(listTemp.size() - 1)) {
                    listTemp.add(string.charAt(j));
                }
            }

            if (listTemp.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(listTemp);
            }
        }

        for (Character character : listMax) {
            System.out.print(character);
        }
    }
}
