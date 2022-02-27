import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * r * r * r;

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
