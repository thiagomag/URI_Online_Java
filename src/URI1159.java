import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while(x != 0){
            int soma = 0;
            for(int i = x; i < x+10; i++){
                if(i % 2 == 0){
                    soma += i;
                }
            }
            System.out.println(soma);
            x = input.nextInt();
        }
    }
}
