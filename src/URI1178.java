import java.util.Scanner;

public class URI1178 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        vetor(n);
    }

    private static void vetor(double n) {
        double[] vet = new double[100];
        vet[0] = n;
        System.out.printf("N[0] = %.4f\n", vet[0]);
        for(int i = 1; i < vet.length; i++){
            vet[i] = n/2.0;
            n = vet[i];
            System.out.printf("N[%d] = %.4f\n", i, vet[i]);
        }
    }
}
