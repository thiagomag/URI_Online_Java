import java.util.Scanner;

public class URI1115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            } else if(x < 0 && y > 0){
                System.out.println("segundo");
            } else if( x < 0 && y < 0){
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = input.nextInt();
            y = input.nextInt();
        }
    }
}
