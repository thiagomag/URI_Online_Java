import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        multiplos(x, y);

    }

    private static void multiplos(int x, int y) {
        if(y % x == 0 || x % y == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
