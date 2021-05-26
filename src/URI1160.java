import java.util.Scanner;

public class URI1160 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int maxAnos = 0;

        for (int i = 0; i < n; i++){
            int cidA = input.nextInt();
            int cidB = input.nextInt();
            double crescA = input.nextDouble();
            double crescB = input.nextDouble();

            while (cidA <= cidB && maxAnos < 101){

                cidA += (int)((cidA*crescA)/100);
                cidB += (int)((cidB*crescB)/100);

                maxAnos++;
            }
            if (maxAnos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.printf("%d anos.\n", maxAnos);
            }
            maxAnos = 0;

        }
    }
}
