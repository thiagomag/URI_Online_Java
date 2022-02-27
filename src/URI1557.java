import java.util.Scanner;

public class URI1557 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n != 0) {
            int[][] mat = new int[n][n];
            matriz(n, mat);
            imprimirMatriz(mat, n);
            n = input.nextInt();
            input.nextLine();
        }
    }

    private static void matriz(int n, int[][] mat) {
        int x = 1, y;
        for (int i = 1; i <= n; i++) {
            y = x;
            for (int j = 1; j <= n; j++) {
                mat[i-1][j-1] = y;
                y *= 2;
            }
            x *= 2;
        }
    }

    private static void imprimirMatriz(int[][] mat, int n) {
        int T = String.valueOf(mat[n-1][n-1]).length();
        StringBuilder str = new StringBuilder();
        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 0) {
                    str.append(String.format("%"+ T +"d", ints[j]));
                } else {
                    str.append(String.format(" %"+ T +"d", ints[j]));
                }
            }
            str.append("\n");
        }
        str.append("\n");
        System.out.print(str);
    }
}
