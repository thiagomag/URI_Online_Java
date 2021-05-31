import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double GASTO_POR_KM = 12;

        int tempo = input.nextInt();
        int velocidade = input.nextInt();

        int distancia = tempo * velocidade;

        double litros = distancia / GASTO_POR_KM;

        System.out.printf("%.3f\n", litros);
    }
}
