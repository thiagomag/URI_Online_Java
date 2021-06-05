import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;

        positivos(input, x);
    }

    private static void positivos(Scanner input, int x) {
        for (int i = 0; i < 6; i++){
            double n = input.nextDouble();
            if(n > 0){
                x++;
            }
        }
        System.out.printf("%d valores positivos\n", x);
    }
}
