import java.util.Scanner;

public class URI1789 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            lesmas(n, input);
        }
    }

    private static void lesmas(int n, Scanner input) {
        int maior = 0;
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            if(x > maior){
                maior = x;
            }
        }
        if (maior < 10) {
            System.out.println(1);
        } else if (maior < 20){
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
