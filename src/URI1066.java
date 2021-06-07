import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        calculo(input);
    }

    private static void calculo(Scanner input) {
        int valoresPares = 0;
        int valoresImpares = 0;
        int valoresPositivos = 0;
        int valoresNegativos = 0;
        for (int i = 0; i < 5; i++) {
            double n = input.nextDouble();
            if (n % 2 == 0) {
                valoresPares++;
            } else {
                valoresImpares++;
            }
            if(n > 0){
                valoresPositivos++;
            } else if (n < 0){
                valoresNegativos++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n"
                , valoresPares, valoresImpares, valoresPositivos, valoresNegativos);
    }
}
