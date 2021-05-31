import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        int ano = valor / 365;
        valor -= (ano * 365);
        int mes = valor / 30;
        valor -= (mes * 30);
        int dia = valor;

        System.out.printf(
                "%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)\n", ano, mes, dia);
    }
}

