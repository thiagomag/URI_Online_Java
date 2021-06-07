import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mediaIdades(input);
    }

    private static void mediaIdades(Scanner input) {
        int idade = input.nextInt();;
        double soma = 0;
        double count = 0;
        while (idade >= 0){
            soma += idade;
            count++;
            idade = input.nextInt();
        }
        double media = soma / count;
        System.out.printf("%.2f\n", media);
    }
}
