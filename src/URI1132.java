import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int a; int b;
        if(x>y){
            a = y; b = x;
        } else {
            a = x; b = y;
        }
        int soma = 0;
        for(int i = a; i <= b; i++){
            if(i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
