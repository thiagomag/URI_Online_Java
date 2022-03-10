import java.util.Scanner;

public class URI1962 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        var n = input.nextInt();
        for(int i = 0; i < n; i++) {
            var ano = input.nextInt();
            var dif = 2015 - ano;
            if (dif < 0) {
                dif = (dif * (-1)) + 1;
                System.out.println(dif + " A.C.");
            } else if (dif > 0) {
                System.out.println(dif + " D.C.");
            } else if (dif == 0) {
                System.out.println((dif + 1) + " A.C.");
            }
        }
 
    }
 
}