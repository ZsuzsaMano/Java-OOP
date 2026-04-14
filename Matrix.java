import java.util.Arrays;

public class Matrix {
    public static void createMatrix() {
        int[][] matrix = new int[10][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {

                matrix[i][j] = j;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        createMatrix();
    }
}
