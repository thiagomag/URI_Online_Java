import java.util.Scanner;

public class URI1828 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        bazinga(n, input);
    }

    private static void bazinga(int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            String sheldon = input.next();
            String raj = input.next();
            if (sheldon.equals("tesoura") && raj.equals("papel") ||
                    sheldon.equals("papel") && raj.equals("pedra") ||
                    sheldon.equals("pedra") && raj.equals("lagarto") ||
                    sheldon.equals("lagarto") && raj.equals("Spock") ||
                    sheldon.equals("Spock") && raj.equals("tesoura") ||
                    sheldon.equals("lagarto") && raj.equals("papel") ||
                    sheldon.equals("papel") && raj.equals("Spock") ||
                    sheldon.equals("Spock") && raj.equals("pedra") ||
                    sheldon.equals("pedra") && raj.equals("tesoura") ||
                    sheldon.equals("tesoura") && raj.equals("lagarto")) {
                System.out.printf("Caso #%d: Bazinga!\n", i + 1);
            } else if (raj.equals("tesoura") && sheldon.equals("papel") ||
                    raj.equals("papel") && sheldon.equals("pedra") ||
                    raj.equals("pedra") && sheldon.equals("lagarto") ||
                    raj.equals("lagarto") && sheldon.equals("Spock") ||
                    raj.equals("Spock") && sheldon.equals("tesoura") ||
                    raj.equals("lagarto") && sheldon.equals("papel") ||
                    raj.equals("papel") && sheldon.equals("Spock") ||
                    raj.equals("Spock") && sheldon.equals("pedra") ||
                    raj.equals("pedra") && sheldon.equals("tesoura") ||
                    raj.equals("tesoura") && sheldon.equals("lagarto")) {
                System.out.printf("Caso #%d: Raj trapaceou!\n", i + 1);
            } else {
                System.out.printf("Caso #%d: De novo!\n", i + 1);
            }
        }
    }
}
