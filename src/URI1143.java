import java.util.Scanner;

public class URI1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        quadradoCubo(n);
    }

    private static void quadradoCubo(int n) {
        for(int i = 1; i <= n; i++){
            double a = Math.pow(i, 2);
            double b = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f\n", i, a, b);
        }
    }
}
