import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            if(y != 0){
                System.out.printf("%.1f\n", divisao(x ,y));
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }

    private static double divisao(double x, double y) {
        return x / y;
    }
}
