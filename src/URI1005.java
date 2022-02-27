import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        double media = ((x * 3.5) + (y * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
