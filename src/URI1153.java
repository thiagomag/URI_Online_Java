import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer total = calculoFatorial(input.nextInt());
        System.out.println(total);
    }

    private static Integer calculoFatorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return calculoFatorial(n-1) * n;
        }
    }
}
