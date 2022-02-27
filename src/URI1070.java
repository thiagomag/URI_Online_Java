import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        impares(input);
    }

    private static void impares(Scanner input) {
        int n = input.nextInt();
        if(n % 2 == 0){
            n += 1;
        }
        for (int i = n; i < n+12; i += 2){
            System.out.println(i);
        }
    }
}
