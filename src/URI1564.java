import java.util.Scanner;

public class URI1564 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            vaiTerCopa(n);
        }
    }

    private static void vaiTerCopa(int n) {
        if(n == 0) {
            System.out.println("vai ter copa!");
        } else {
            System.out.println("vai ter duas!");
        }
    }
}
