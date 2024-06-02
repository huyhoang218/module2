package account;

public class AccountTest {
    private static Account account;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        account = new Account();

        for (String acc : validAccount) {
            boolean isValid = account.validate(acc);
            System.out.println("Account is " + acc + " is valid " + isValid);
        }

        for (String acc : invalidAccount) {
            boolean isInvalid = account.validate(acc);
            System.out.println("Account is " + acc + " is vaild " + isInvalid);
        }
    }
}
