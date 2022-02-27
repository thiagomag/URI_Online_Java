import java.util.Scanner;

public class URI1151 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = input.nextInt();
        System.out.printf("%d %d", a, b);
        for (int i = 0; i < n-2; i++){
            int c = a + b;
            System.out.printf(" %d", c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
