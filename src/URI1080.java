import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        maiorEPos(input);
    }

    private static void maiorEPos(Scanner input) {
        int maior = 0;
        int pos = 0;
        for(int i = 1; i <= 100; i++){
            int x = input.nextInt();
            if(x > maior){
                maior = x;
                pos = i;
            }
        }
        System.out.printf("%d\n%d\n", maior, pos);
    }
}
