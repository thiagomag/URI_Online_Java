import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = n; i > 1; i--){
            n *= (i-1);
        }
        System.out.println(n);
    }
}
