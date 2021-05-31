import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        int cem = (int) (valor / 100);
        valor -= (cem * 100);
        int ciquenta = (int) (valor / 50);
        valor -= (ciquenta * 50);
        int vinte = (int) (valor / 20);
        valor -= (vinte * 20);
        int dez = (int) (valor / 10);
        valor -= (dez * 10);
        int cinco = (int) (valor / 5);
        valor -= (cinco * 5);
        int dois = (int) (valor / 2);
        valor -= (dois * 2);
        int um = (int) valor;
        int moedaCinquenta = (int) (valor / 0.50);
        valor -= (moedaCinquenta * 0.50);
        int moedaVinteECinco = (int) (valor / 0.25);
        valor -= (moedaVinteECinco * 0.25);
        int moedaDez = (int) (valor / 0.10);
        valor -= (moedaDez * 0.10);
        int moedaCinco = (int) (valor / 0.5);
        valor -= (moedaCinco * 0.5);
        int moedaUm = (int) (valor / 0.01);

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
