import java.util.Scanner;

public class URI1759 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("Ho");
            } else {
                System.out.print(" Ho");
            }
        }
        System.out.println("!");
    }
}
