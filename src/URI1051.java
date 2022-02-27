import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();

        calculoImposto(salario);
    }

    private static void calculoImposto(double salario) {
        double imposto = 0;
        if(salario > 2000.00 && salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario > 3000.00 && salario <= 4500.00){
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario > 4500.00){
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            System.out.println("Isento");
        }
    }
}
