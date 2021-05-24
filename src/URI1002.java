import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double pi = 3.14159;
        double area = pi * r * r;

        System.out.printf("A=%.4f%n", area);
    }
}