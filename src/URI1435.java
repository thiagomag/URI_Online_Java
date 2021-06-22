import java.util.Scanner;

public class URI1435 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            n = input.nextInt();
            int[][] mat = new int[n][n];
            matriz(n, mat);
            imprimirMatriz(mat);
        } while (n != 0);
    }

    private static void matriz(int n, int[][] mat) {
        int fimMatriz = n;
        int iniMatriz = 0;
        int elemento = 1;
        while(fimMatriz != 0){
            for (int i = iniMatriz; i < fimMatriz; i++) {
                for (int j = iniMatriz; j < fimMatriz; j++) {
                    mat[i][j] = elemento;
                }
            }
            fimMatriz--;
            iniMatriz++;
            elemento++;
        }
    }

    private static void imprimirMatriz(int[][] mat) {
        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                if (j == 0) {
                    System.out.printf("%3d", ints[j]);

                } else {
                    System.out.printf("%4d", ints[j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
