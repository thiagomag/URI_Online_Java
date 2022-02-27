import java.util.Scanner;

public class URI1961 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamSalto = input.nextInt();
        int n = input.nextInt();
        int[] saltos = new int[n];
        boolean ganhou = true;

        for (int i = 0; i < n; i++) {
            saltos[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (saltos[i] < saltos[i - 1]) {
                if (saltos[i - 1] - saltos[i] > tamSalto) {
                    ganhou = false;
                }
            } else if (saltos[i] > saltos[i - 1]){
                if (saltos[i] - saltos[i - 1] > tamSalto) {
                    ganhou = false;
                }
            }
        }
        if (ganhou) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }
}
