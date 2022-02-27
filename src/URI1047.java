import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hora1 = input.nextInt();
        int min1 = input.nextInt();
        int hora2 = input.nextInt();
        int min2 = input.nextInt();

        duracaoPartida(hora1, min1, hora2, min2);


    }

    private static void duracaoPartida(int hora1, int min1, int hora2, int min2) {
        if(hora2 >= hora1) {
            if(min2 >= min1) {
                int duracaoHora = hora2 - hora1;
                int duracaoMin = min2 - min1;
                if(duracaoHora == 0 && duracaoMin == 0){
                    System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
                } else {
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHora, duracaoMin);
                }
            } else {
                int duracaoHora;
                if(hora1 == hora2){
                    duracaoHora = 24 + hora2 - hora1 - 1;
                } else {
                    duracaoHora = hora2 - hora1 - 1;
                }
                int duracaoMin = 60 + (min2 - min1);
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHora, duracaoMin);
            }
        } else {
            int duracaoHora;
            int duracaoMin;
            if(min2 >= min1){
                duracaoHora = 24 + hora2 - hora1;
                duracaoMin = min2 - min1;
            } else {
                duracaoHora = 24 + hora2 - hora1 - 1;
                duracaoMin = 60 + (min2 - min1);
            }
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHora, duracaoMin);
        }
    }
}
