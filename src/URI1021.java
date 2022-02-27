import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        int notas = (int) valor;
        int moedas = (int) ((valor - notas)*100);

        int cem = (notas / 100);
        notas -= (cem * 100);
        int ciquenta = (notas / 50);
        notas -= (ciquenta * 50);
        int vinte = (notas / 20);
        notas -= (vinte * 20);
        int dez = (notas / 10);
        notas -= (dez * 10);
        int cinco = (notas / 5);
        notas -= (cinco * 5);
        int dois = (notas / 2);
        notas -= (dois * 2);
        int um = notas;
        int moedaCinquenta = (moedas / 50);
        moedas -= (moedaCinquenta * 50);
        int moedaVinteECinco = moedas / 25;
        moedas -= (moedaVinteECinco * 25);
        int moedaDez = moedas / 10;
        moedas -= (moedaDez * 10);
        int moedaCinco = moedas / 5;
        moedas -= (moedaCinco * 5);
        int moedaUm = (moedas);

        System.out.printf("NOTAS:\n" +
                "%d nota(s) de R$ 100.00\n" +
                "%d nota(s) de R$ 50.00\n" +
                "%d nota(s) de R$ 20.00\n" +
                "%d nota(s) de R$ 10.00\n" +
                "%d nota(s) de R$ 5.00\n" +
                "%d nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "%d moeda(s) de R$ 1.00\n" +
                "%d moeda(s) de R$ 0.50\n" +
                "%d moeda(s) de R$ 0.25\n" +
                "%d moeda(s) de R$ 0.10\n" +
                "%d moeda(s) de R$ 0.05\n" +
                "%d moeda(s) de R$ 0.01\n", cem, ciquenta, vinte, dez, cinco, dois, um, moedaCinquenta, moedaVinteECinco, moedaDez, moedaCinco, moedaUm);
    }
}
