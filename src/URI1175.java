import java.util.Scanner;

public class URI1175 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] n = new int[20];
        int[] x;

        x = criarVetor(n, input);
        reordenarVetor(x, input);
    }

    private static int[] criarVetor(int[] n, Scanner input) {
        for (int i = 0; i < n.length; i++){
            n[i] = input.nextInt();
        }
        return n;
    }

    private static void reordenarVetor(int[] x, Scanner input) {
        for (int i = x.length-1; i >= 0; i--){
            System.out.printf("N[%d] = %d\n", x.length - 1 - i, x[i]);
        }
    }
}
