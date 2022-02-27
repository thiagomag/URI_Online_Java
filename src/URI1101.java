import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        while(x > 0 && y > 0) {
            sequenciaSoma(x, y);
            x = input.nextInt();
            y = input.nextInt();
        }
    }

    private static void sequenciaSoma(int x, int y) {
        int a; int b;
        if(x > y){
            a = y;
            b = x;
        } else {
            a = x;
            b = y;
        }
        int soma = 0;
        for(int i = a; i <= b; i++){
            soma += i;
            System.out.printf("%d ", i);
        }
        System.out.println("Sum=" + soma);
    }
}
