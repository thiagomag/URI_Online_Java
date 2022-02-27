import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double dist = distancia(a, b, c, d);

        System.out.printf("%.4f\n", dist);
    }

    private static double distancia(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow((c-a), 2) + Math.pow((d-b), 2));
    }
}
