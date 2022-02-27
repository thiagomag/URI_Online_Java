import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        esperiencias(n, input);
    }

    private static void esperiencias(int n, Scanner input) {
        int somaTotal = 0;
        int somaCoelho = 0;
        int somaRato = 0;
        int somaSapo = 0;
        for (int i = 0; i < n; i++) {
            int qtdCobaia = input.nextInt();
            char tipoCobaia = input.next().charAt(0);
            somaTotal += qtdCobaia;
            switch (tipoCobaia) {
                case 'C':
                    somaCoelho += qtdCobaia;
                    break;
                case 'S':
                    somaSapo += qtdCobaia;
                    break;
                case 'R':
                    somaRato += qtdCobaia;
                    break;
            }
        }
        double percCoelho = (double) somaCoelho / somaTotal * 100;
        double percRato = (double) somaRato / somaTotal * 100;
        double percSapo = (double) somaSapo / somaTotal * 100;

        System.out.printf("Total: %d cobaias\n" +
                "Total de coelhos: %d\n" +
                "Total de ratos: %d\n" +
                "Total de sapos: %d\n" +
                "Percentual de coelhos: %.2f %%\n" +
                "Percentual de ratos: %.2f %%\n" +
                "Percentual de sapos: %.2f %%\n",
                somaTotal, somaCoelho, somaRato, somaSapo, percCoelho, percRato, percSapo);
    }
}
