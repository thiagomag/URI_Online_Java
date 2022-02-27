import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        duracaoPartida(x, y);

    }

    private static void duracaoPartida(int x, int y) {
        if(x > y){
            int duracao = (24 - x) + y;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        } else if(y > x) {
            int duracao = (y - x);
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
