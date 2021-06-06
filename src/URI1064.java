import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        positivosEMedia(input);
    }

    private static void positivosEMedia(Scanner input) {
        double soma = 0;
        int valoresPos = 0;
        for (int i = 0; i < 6; i++) {
            double n = input.nextDouble();
            if (n > 0) {
                soma += n;
                valoresPos++;
            }
        }
        double media = soma / valoresPos;
        System.out.printf("%d valores positivos\n%.1f\n", valoresPos, media);
    }
}