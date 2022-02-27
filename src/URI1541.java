import java.util.Scanner;

public class URI1541 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        do {
            a = input.nextDouble();
            if (a == 0)
                break;
            double b = input.nextDouble();
            double c = input.nextDouble();
            calculoTerreno(a, b, c);
        } while (a != 0);
    }

    private static void calculoTerreno(double a, double b, double c) {
        int ladoTerreno = (int) Math.sqrt((a * b) / (c/100));
        System.out.println(ladoTerreno);
    }
}
