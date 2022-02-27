import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        do{
            x = input.nextInt();
            y = input.nextInt();
            if(x < y){
                System.out.println("Crescente");
            } else if (x > y){
                System.out.println("Decrescente");
            }
        } while (x != y);
    }
}