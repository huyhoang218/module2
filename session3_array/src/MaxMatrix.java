public class MaxMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.5, 4, 5.6, 6.3},
                {6.34, 3.54, 8.0, -84.5},
                {34.33, 34, 84.43, 3.3}
        };
        double max = matrix[0][0];
        int row = 0;
        int column = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (max < matrix[r][c]) {
                    max = matrix[r][c];
                    row = r;
                    column = c;
                }
            }
        }

        System.out.println("element max of matrix is: " + max + " row: " + row + " column: " + column);
    }
}
