import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        somaImparesConsecutivos(n , input);
    }

    private static void somaImparesConsecutivos(int n, Scanner input) {

        for(int i = 0; i < n; i++){
            int soma = 0;
            int x = input.nextInt();
            int y = input.nextInt();
            int a; int b;
            if(x > y){
                a = y;
                b = x;
            } else {
                a = x;
                b = y;
            }
            for(int j = a+1; j < b; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}
