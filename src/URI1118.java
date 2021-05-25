import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int novoCalculo = 1;
        while (novoCalculo == 1){
            int n = 0;
            double soma = 0;
            int count = 0;
            do {
                double nota = input.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    count++;
                } else {
                    System.out.println("nota invalida");
                }
            } while (count != 2);
            double media = soma / count;
            System.out.printf("media = %.2f\n", media);

            while (n != 2 && n != 1) {
                System.out.println("novo calculo (1-sim 2-nao)");
                n = input.nextInt();
                if (n == 1 || n == 2) {
                    novoCalculo = n;
                    media = 0;
                } else {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    n = input.nextInt();
                }
            }
        }
    }
}
