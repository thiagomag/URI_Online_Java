import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        sequenciaLogica(n, x);
    }

    private static void sequenciaLogica(int n, int x) {
        for(int i = 1; i <= x; i++){
            if(i % n == 0){
                System.out.printf("%d\n", i);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
