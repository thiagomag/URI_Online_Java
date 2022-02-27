import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        mediaPonderada(n, input);
    }

    private static void mediaPonderada(int n, Scanner input) {
        for(int i = 0; i < n; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            double media = ((x*2) + (y*3) + (z*5)) / 10;

            System.out.printf("%.1f\n", media);
        }
    }
}
