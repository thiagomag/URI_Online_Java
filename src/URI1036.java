import java.util.Scanner;

import static java.lang.Math.sqrt;

public class URI1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta > 0 && a > 0 || a < 0){
            double r1 = (-b + sqrt(delta)) / (2 * a);
            double r2 = (-b - sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n" +
                    "R2 = %.5f\n", r1, r2);

        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
