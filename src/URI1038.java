import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int preco = input.nextInt();
        double total = 0;

        switch (codigo){
            case 1:
                total = preco * 4.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 2:
                total = preco * 4.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 3:
                total = preco * 5.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 4:
                total = preco * 2.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            default:
                total = preco * 1.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
        }
    }
}