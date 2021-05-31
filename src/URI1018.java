import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        int total = valor;
        int cem = valor / 100;
        valor -= (cem * 100);
        int ciquenta = valor / 50;
        valor -= (ciquenta * 50);
        int vinte = valor / 20;
        valor -= (vinte * 20);
        int dez = valor / 10;
        valor -= (dez * 10);
        int cinco = valor / 5;
        valor -= (cinco * 5);
        int dois = valor / 2;
        valor -= (dois * 2);
        int um = valor;

        System.out.printf("%d\n" +
                          "%d nota(s) de R$ 100,00\n" +
                          "%d nota(s) de R$ 50,00\n" +
                          "%d nota(s) de R$ 20,00\n" +
                          "%d nota(s) de R$ 10,00\n" +
                          "%d nota(s) de R$ 5,00\n" +
                          "%d nota(s) de R$ 2,00\n" +
                          "%d nota(s) de R$ 1,00\n",total , cem, ciquenta, vinte, dez, cinco, dois, um);
    }
}