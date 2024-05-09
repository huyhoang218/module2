import java.util.Scanner;

public class MoneyCoversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money USD: ");
        int usd = scanner.nextInt();

        int rate = 23000;
        long vnd = usd * rate;

        System.out.print(usd + " USD = " + vnd + " VND");
    }
}
