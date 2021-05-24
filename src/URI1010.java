import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codProd1 = input.nextInt();
        int numPeca1 = input.nextInt();
        double precoPeca1 = input.nextDouble();

        int codProd2 = input.nextInt();
        int numPeca2 = input.nextInt();
        double precoPeca2 = input.nextDouble();

        double valor = (numPeca1 * precoPeca1) + (numPeca2 * precoPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}
