import java.util.Scanner;
public class CountSting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "huy hoang";
        System.out.print("Enter a char: ");
        char c = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
