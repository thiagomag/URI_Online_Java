import java.util.Scanner;

public class URI1075 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        restoDois(n);
    }

    private static void restoDois(int n) {
        for(int i = 1; i <= 10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
