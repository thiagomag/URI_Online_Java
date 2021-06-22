import java.util.Scanner;

public class URI1837 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int q, r, e, f = 0;
        if (a < 0) {
            e = b;
            if (b < 0) {
                e = b * -1;
            }
            r = 0;
            while (r < e){
                f = a - r;
                if (f % b == 0)
                    break;
                r++;
            }
            q = f / b;
        }else {
            q = a / b;
            r = a % b;
        }
        System.out.println(q + " " + r);
    }
}
