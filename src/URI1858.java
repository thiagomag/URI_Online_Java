import java.util.Scanner;

public class URI1858 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        escolhaTheon(n, input);
    }

    private static void escolhaTheon(int n, Scanner input) {
        int menor = 99999;
        int count = -1;
        for (int i = 0; i < n; i++) {
            int pessoa = input.nextInt();
            if (pessoa < menor) {
                menor = pessoa;
                count = i+1;
            }
        }
        System.out.println(count);
    }
}
