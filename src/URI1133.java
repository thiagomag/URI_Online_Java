import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int a; int b;
        if(x>y){
            a = y; b = x;
        } else {
            a = x; b = y;
        }
        for(int i = a+1; i < b; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}
