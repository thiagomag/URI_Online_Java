import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int alcool = 0; int gasolina = 0; int diesel = 0;
        do{
            n = input.nextInt();
            switch (n){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        } while(n != 4);
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
    }
}
