import java.util.Scanner;

public class URI1929 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = lerLados(input);
        int b = lerLados(input);
        int c = lerLados(input);
        int d = lerLados(input);
        calcularTrinagulo(a, b, c, d);
    }

    private static void calcularTrinagulo(int a, int b, int c, int d) {
        if(a < b + c && a > Math.abs(b - c) ||
                b < a + c && b > Math.abs(a - c) ||
                c < a + b && c > Math.abs(a - b) ||
                a < b + d && a > Math.abs(b - d) ||
                b < a + d && b > Math.abs(a - d) ||
                d < a + b && d > Math.abs(a - b) ||
                a < c + d && a > Math.abs(c - d) ||
                c < a + d && c > Math.abs(a - d) ||
                d < a + c && d > Math.abs(a - c) ||
                b < c + d && b > Math.abs(c - d) ||
                c < b + d && c > Math.abs(b - d) ||
                d < b + c && d > Math.abs(b - c)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

    private static int lerLados(Scanner input) {
        return input.nextInt();
    }
}
