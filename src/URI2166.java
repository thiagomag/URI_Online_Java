import java.util.Scanner;

public class URI2166 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double raiz = 0.00;

        while(n != 0){
            raiz += 2.00;
            raiz = 1/raiz;
            n--;
        }
        raiz += 1.00;
        System.out.printf("%.10f\n", raiz);
    }
}
