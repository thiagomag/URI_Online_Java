import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        double combustivel = input.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("%.3f km/l\n", consumo);
    }
}
