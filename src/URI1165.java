import java.util.Scanner;

public class URI1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            int x = input.nextInt();
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.printf("%d nao eh primo\n", x);
            } else {
                System.out.printf("%d eh primo\n", x);
            }
        }
    }
}
