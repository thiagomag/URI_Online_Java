import java.util.Scanner;

public class URI1164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int soma = 0;
            int x = input.nextInt();
            for (int j = 1; j < x; j++) {
                if (x % j == 0) {
                    soma += j;
                }
            }
            if (soma == x) {
                System.out.printf("%d eh perfeito\n", x);
            } else {
                System.out.printf("%d nao eh perfeito\n", x);
            }
        }
    }
}