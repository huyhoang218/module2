import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;

        System.out.print("total rows = ");
        rows = input.nextInt();
        System.out.print("total columns = ");
        columns = input.nextInt();

        double[][] array = new double[rows][columns];
        //Nhập phần tử mảng
        for (int r = 0; r < rows; r++) {
            System.out.print("row " + r + " ");
            for (int c = 0; c < columns; c++) {
                array[r][c] = input.nextDouble();
            }
            System.out.println();
        }

        System.out.print("Nhập cột muốn tính tổng: ");
        int column = input.nextInt();
        double sumColumn = 0;
        System.out.println(sumColumn(array, column, sumColumn));

        double total = 0;
        System.out.println("Total of diagoal line is " + diagonalLine(array, total));
    }

    //Tính tổng cột
    public static double sumColumn(double[][] array, int column, double sumColumn) {
        for (int c = 0; c < array[0].length; c++) {
            for (int r = 0; r < array.length; r++) {
                if (c == column)
                    sumColumn += array[r][c];
            }
        }
        return sumColumn;
    }

    //Tính tổng đường chéo
    public static double diagonalLine(double[][] arr, double total) {
        for (int r = 0; r < arr.length; r++) {
            total += arr[r][r];
        }
        return total;
    }
}
