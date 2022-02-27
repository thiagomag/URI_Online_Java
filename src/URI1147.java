import java.util.Scanner;

public class URI1147 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n;
        do {
            n = input.nextInt();
        } while(n <= 0);
        somando(a, n);
    }

    private static void somando(int a, int n) {
        int soma = 0;
        for (int i = 0; i < n; i++){
            soma += a + i;
        }
        System.out.println(soma);
    }
}
