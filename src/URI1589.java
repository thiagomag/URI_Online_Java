import java.util.Scanner;

public class URI1589 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            conduite(input);
        }
    }

    private static void conduite(Scanner input) {
        int x = input.nextInt();
        int y = input.nextInt();
        int conduite = x + y;
        System.out.println(conduite);
    }
}
