import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double triangulo = (a * c)/2;
        double circulo = 3.14159 * c * c;
        double trapezio = ((a + b)/2)*c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
    }
}
