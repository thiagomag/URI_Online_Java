import java.util.Scanner;

public class URI1864 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPalavra(n);
    }

    private static void printPalavra(int n) {
        String palava = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        for (int i = 0; i < n; i++){
            System.out.print(palava.charAt(i));
        }
        System.out.println();
    }
}
