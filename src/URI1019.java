import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        int total = valor;
        int hora = valor / 3600;
        valor -= (hora * 3600);
        int minuto = valor / 60;
        valor -= (minuto * 60);
        int segundo = valor;

        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
}
