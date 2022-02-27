import java.util.Scanner;

public class URI1957 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(conversaoHexadecimal(n));
    }

    private static StringBuilder conversaoHexadecimal(int n) {
        int d = n;
        StringBuilder s = new StringBuilder();
        while(d != 0) {
            int h = d%16;
            d = (d-h)/16;
            if(h >= 10){
                char r = getChar(h);
                s.append(r);
            } else {
                s.append(h);
            }
        }
        return s;
    }

    private static char getChar(int h) {
        char r;
        switch (h) {
            case 10:
                r = 'A';
                break;
            case 11:
                r = 'B';
                break;
            case 12:
                r = 'C';
                break;
            case 13:
                r = 'D';
                break;
            case 14:
                r = 'E';
                break;
            case 15:
                r = 'F';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + h);
        }
        return r;
    }
}
