import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1 = lerNota(input);
        double nota2 = lerNota(input);
        double nota3 = lerNota(input);

        double media = calculaMedia(nota1, nota2, nota3);

        System.out.printf("MEDIA = %.1f\n", media);
    }

    private static double calculaMedia(double nota1, double nota2, double nota3) {
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
    }

    private static double lerNota(Scanner input) {
        double nota;
        do {
            nota = input.nextDouble();
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
