import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.next();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double salarioTotal = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}
