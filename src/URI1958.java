import java.util.Scanner;

public class URI1958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        System.out.printf((String.valueOf(x).startsWith("-") ? "" : "+") + "%.4E%n", x);
    }

//        double x = Double.parseDouble(sc.next());
//        StringBuilder resp = new StringBuilder();
//
//        var count = 0;
//        var y = x;
//        if(x < -1 || x > 1) {
//            while (x > 10 || x < -10) {
//                x = x / 10;
//                count++;
//            }
//        } else {
//            while (-1 < x && x < 1) {
//                x = x / 0.1;
//                count++;
//            }
//        }
//        creatingResponse(x, resp, count, y);
//        System.out.println(resp);
//    }
//
//    private static void creatingResponse(double x, StringBuilder resp, int count, double y) {
//        if(y > 1) {
//            resp.append("+").append(String.format("%.4f", x)).append("E+");
//        } else if (-1 < y && y < 1){
//            resp.append(String.format("%.4f", x)).append("E-");
//        } else {
//            resp.append(String.format("%.4f", x)).append("E+");
//        }
//        if(count < 10) {
//            resp.append("0").append(count);
//        } else {
//            resp.append(count);
//        }
//    }
}
