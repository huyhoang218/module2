
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];

        books[0] = new ProgrammingBook(1, "learn java", 100, "dragon", "java", "reactjava");
        books[1] = new ProgrammingBook(2, "learn c++", 200, "hoangdao", "c++", "reactc++");
        books[2] = new ProgrammingBook(3, "learn js", 300, "hoangdaohuy", "java", "reactjs");

        books[3] = new FictionBook(4, "doraemon", 400, "kimochi", "truyen tranh");
        books[4] = new FictionBook(5, "ny cua toi", 500, "hoang", "Vien tuong 1");
        books[5] = new FictionBook(6, "star war", 600, "oda", "action");

        double sum = 0;
        sum = getSum(books, sum);
        System.out.println("Tong tien 6 cuon sach: " + sum);

        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook pb = (ProgrammingBook) book;
                String language = pb.getLanguage();
                if (language.equals("java")) count++;
            }
        }

        System.out.println("So ngon ngu java trong programming : " + count);

        int countCatGory = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fb = (FictionBook) book;
                String cateGory = fb.getCateGory();
                if (cateGory.equals("Vien tuong 1")) countCatGory++;
            }
        }

        System.out.println(countCatGory);
    }

    private static double getSum(Book[] books, double sum) {
        for (Book book : books) {
            sum += book.getAmount();
        }
        return sum;
    }
}
