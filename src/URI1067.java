import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        impares(input);
    }

    private static void impares(Scanner input) {
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
