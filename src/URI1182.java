import java.util.Scanner;

public class URI1182 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String c = input.nextLine().toUpperCase();
        double[][] mat = montarMatriz(input);
        calculoMatriz(mat, n, c);
    }

    private static void calculoMatriz(double[][] mat, int n, String c) {
        double soma = 0;
        for (double[] doubles : mat) {
            soma += doubles[n];
        }
        if (c.equals("S")) {
            System.out.printf("%.1f", soma);
        } else {
            System.out.printf("%.1f\n", soma/mat.length);
        }
    }

    private static double[][] montarMatriz(Scanner input) {
        double[][] mat = new double[12][12];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = input.nextDouble();
            }
        }
        return mat;
    }
}