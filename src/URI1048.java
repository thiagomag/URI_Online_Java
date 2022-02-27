import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();

        aumentoSalario(salario);
    }

    private static void aumentoSalario(double salario) {
        if(salario > 0.0 && salario <= 400.00){
            System.out.printf("Novo salario: %.2f\n" +
                    "Reajuste ganho: %.2f\n" +
                    "Em percentual: 15 %%\n", salario * 1.15, salario * 0.15);
        } else if(salario > 400.00 && salario <= 800.00){
            System.out.printf("Novo salario: %.2f\n" +
                    "Reajuste ganho: %.2f\n" +
                    "Em percentual: 12 %%\n", salario * 1.12, salario * 0.12);
        } else if(salario > 800.00 && salario <= 1200.00){
            System.out.printf("Novo salario: %.2f\n" +
                    "Reajuste ganho: %.2f\n" +
                    "Em percentual: 10 %%\n", salario * 1.10, salario * 0.10);
        } else if(salario > 1200.00 && salario <= 2000.00){
            System.out.printf("Novo salario: %.2f\n" +
                    "Reajuste ganho: %.2f\n" +
                    "Em percentual: 7 %%\n", salario * 1.07, salario * 0.07);
        } else if(salario > 2000.00){
            System.out.printf("Novo salario: %.2f\n" +
                    "Reajuste ganho: %.2f\n" +
                    "Em percentual: 4 %%\n", salario * 1.04, salario * 0.04);
        }
    }
}