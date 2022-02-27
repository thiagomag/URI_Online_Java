import java.util.Scanner;

public class URI1144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sequenciaLogica(n);
    }

    private static void sequenciaLogica(int n) {
        for(int i = 1; i <= n; i++){
            double a = Math.pow(i, 2);
            double b = Math.pow(i, 3);
            double c = Math.pow(i, 2) + 1;
            double d = Math.pow(i, 3) + 1;
            System.out.printf("%d %.0f %.0f\n" +
                    "%d %.0f %.0f\n",
                    i, a, b, i, c, d);
        }
    }
}
