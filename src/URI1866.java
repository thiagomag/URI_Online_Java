import java.util.Scanner;

public class URI1866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            conta(input);
        }
    }

    private static void conta(Scanner input) {
        int x = 1, y = -1, soma = 0;
        int z = input.nextInt();
        int tam1 = z/2;
        int tam2 = z - tam1;
        for(int i = 0; i < tam2; i++) {
            soma += x;
        }
        for(int i = 0; i < tam1; i++) {
            soma += y;
        }
        System.out.println(soma);
    }
}
