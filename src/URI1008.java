import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int horaTrabalho = input.nextInt();
        double valorHora = input.nextDouble();

        double salario = horaTrabalho * valorHora;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, salario);
    }
}
