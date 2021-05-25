import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n * 4; i++){
            if(i % 4 != 0){
                System.out.printf("%d ", i);
            } else {
                System.out.println("PUM");
            }
        }
    }
}
