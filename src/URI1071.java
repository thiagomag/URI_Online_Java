import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        somaImparesConsecutivos(a, b);
    }

    private static void somaImparesConsecutivos(int x, int y) {
        int soma = 0;
        for(int i = x+1; i < y; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
