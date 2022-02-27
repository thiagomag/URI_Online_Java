import java.util.Scanner;

public class URI1914 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) parImpar(input);
    }

    private static void parImpar(Scanner input) {
        String nome1 = input.next();
        String escolha1 = input.next();
        String nome2 = input.next();
        String escolha2 = input.next();

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int soma = num1 + num2;
        if(escolha1.equals("PAR") && soma%2 == 0 ||
                escolha1.equals("IMPAR") && soma%2 != 0) {
            System.out.println(nome1);
        } else {
            System.out.println(nome2);
        }
    }
}
