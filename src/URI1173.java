import java.util.Scanner;

public class URI1173 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[10];
        n[0] = input.nextInt();

        for(int i = 1; i < 10; i++){
            n[i] = n[i-1] * 2;
        }
        for(int i = 0; i < 10; i++){
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
