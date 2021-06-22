import java.util.Scanner;

public class URI1534 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int[][] mat = new int[n][n];
            matriz(n, mat);
            imprimirMatriz(mat);
        }
    }

    private static void matriz(int n, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mat[i][j] = 1;
                }
                if (i + j == mat.length - 1) {
                    mat[i][j] = 2;
                }
                if (i != j && i + j != mat.length - 1) {
                    mat[i][j] = 3;
                }
            }
        }
    }

    private static void imprimirMatriz(int[][] mat) {

        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }
}
