import java.util.Scanner;

public class URI1184 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();
        double[][] mat = montarMatriz(input);
        calculoMatriz(mat, c);
    }

    private static void calculoMatriz(double[][] mat, String c) {
        double soma = 0;
        double count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j < i){
                    soma += mat[i][j];
                    count++;
                }
            }
        }
        if (c.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma/count);
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