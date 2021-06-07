import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        quadradoDePares(n);
    }

    private static void quadradoDePares(int n) {
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.printf("%d^2 = %d\n", i, (int) Math.pow(i, 2));
            }
        }
    }
}
