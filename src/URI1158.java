import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        somaConsecutivos(n, input);
    }

    private static void somaConsecutivos(int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int soma = 0;
            if (x % 2 == 0) {
                for (int j = x; j <= x + 2 * y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else {
                for (int j = x; j <= x + (2 * y) - 1; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}
