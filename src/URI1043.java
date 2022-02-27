import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a < b + c && b < a + c && c < a + b){
            System.out.printf("Perimetro = %.1f\n" , a+b+c);
        } else {
            System.out.printf("Area = %.1f\n", ((a+b)/2)*c);
        }
    }
}
