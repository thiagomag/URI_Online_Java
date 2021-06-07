import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        intervalo(input);
    }

    private static void intervalo(Scanner input) {
        int in = 0;
        int out = 0;
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            if(x >= 10 && x <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}
