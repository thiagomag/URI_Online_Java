import java.util.Scanner;

public class URI1478 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n != 0) {
            int[][] mat = new int[n][n];
            matriz(n, mat);
            imprimirMatriz(mat);
            n = input.nextInt();
            input.nextLine();
        }
    }

    private static void matriz(int n, int[][] mat) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    mat[i][j] = 1;
                if (i < j)
                    mat[i][j] = j - i + 1;
                if (i > j)
                    mat[i][j] = i - j + 1;
            }
        }
    }

    private static void imprimirMatriz(int[][] mat) {
        StringBuilder str = new StringBuilder();
        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 0) {
                    str.append(String.format("%3d", ints[j]));
                } else {
                    str.append(String.format("%4d", ints[j]));
                }
            }
            str.append("\n");
        }
        str.append("\n");
        System.out.print(str);
    }
}