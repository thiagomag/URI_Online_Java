import java.util.Scanner;

public class URI1827 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int[][] mat = new int[n][n];
            matriz(n, mat);
            imprimirMatriz(mat, n);
        }
    }

    private static void matriz(int n, int[][] mat) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat.length / 2 == i && mat.length / 2 == j) {
                    mat[i][j] = 4;
                } else if (i >= mat.length / 3 &&
                        j >= mat.length / 3 &&
                        mat.length - i > mat.length / 3 &&
                        mat.length - j > mat.length / 3) {
                    mat[i][j] = 1;
                } else if (i == j) {
                    mat[i][j] = 2;
                } else if (i == mat.length - 1 - j) {
                    mat[i][j] = 3;
                } else {
                    mat[i][j] = 0;
                }
            }
        }
    }

    private static void imprimirMatriz(int[][] mat, int n) {
        StringBuilder str = new StringBuilder();
        for (int[] ints : mat) {
            for (int anInt : ints) {
                str.append(String.format("%d", anInt));
            }
            str.append("\n");
        }
        str.append("\n");
        System.out.print(str);
    }
}
