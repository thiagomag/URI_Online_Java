import java.util.Scanner;

public class URI1177 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        vetor(n);
    }

    private static void vetor(int n) {
        int[] vet = new int[1000];
        for(int i = 0; i < vet.length; i++) {
            vet[i] = i%n;
            System.out.printf("N[%d] = %d\n", i, vet[i]);

        }
    }
}
