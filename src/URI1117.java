import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        int count = 0;
        do{
            double nota = input.nextDouble();
            if(nota >= 0 && nota <= 10){
                soma += nota;
                count++;
            } else {
                System.out.println("nota invalida");
            }
        } while (count != 2);
        double media = soma / count;
        System.out.printf("media = %.2f\n", media);
    }
}
