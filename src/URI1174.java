import java.util.Scanner;

public class URI1174 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[100];
        for (int i = 0; i < 100; i++) {
            a[i] = input.nextDouble();
        }
        for (int i = 0; i < 100; i++) {
            if (a[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
            }
        }
    }
}
