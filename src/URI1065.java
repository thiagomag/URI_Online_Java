import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        pares(input);
    }

    private static void pares(Scanner input) {
        int valoresPares = 0;
        for (int i = 0; i < 5; i++) {
            double n = input.nextDouble();
            if (n % 2 == 0) {
                valoresPares++;
            }
        }
        System.out.printf("%d valores pares\n", valoresPares);
    }
}
