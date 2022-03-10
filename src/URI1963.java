import java.util.Scanner;

public class URI1962 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        var p1 = input.nextDouble();
        var p2 = input.nextDouble();
        var a = "%";
        var perc = ((p2 / p1) - 1) * 100;

        System.out.printf("%.2f%s\n", perc, a);
    }
 
}