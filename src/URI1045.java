import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x;
        double y;
        double z;

        if(b > a && b > c){
            x = b;
            y = a;
            z = c;
        } else if (c > a && c > b){
            x = c;
            y = a;
            z = b;
        } else {
            x = a;
            y = b;
            z = c;
        }

        tiposTrianguloPorAngulo(x, y, z);
        tiposTrianguloPorLado(x, y, z);
    }

    private static void tiposTrianguloPorLado(double a, double b, double c) {
        if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || a == c || b == c){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

    private static void tiposTrianguloPorAngulo(double a, double b, double c) {
        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double v = Math.pow(b, 2) + Math.pow(c, 2);
            if(Math.pow(a, 2) == v){
                System.out.println("TRIANGULO RETANGULO");
            } else if(Math.pow(a, 2) > v){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if(Math.pow(a, 2) < v){
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }
    }
}
