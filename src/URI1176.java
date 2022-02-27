import java.util.Scanner;

public class URI1176 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[] fib = new long[10000];

        fib[0] = 0L;
        fib[1] = 1L;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            System.out.println("Fib(" + x +") = " + fib[x]);
        }
    }
}
