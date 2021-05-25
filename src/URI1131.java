import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int novoGrenal = 1;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empate = 0;
        int grenais = 0;
        while (novoGrenal == 1) {
            int golInt = input.nextInt();
            int golGre = input.nextInt();
            if(golInt > golGre){
                vitoriaInter++;
            } else if(golGre > golInt){
                vitoriaGremio++;
            } else {
                empate++;
            }
            int n = 0;
            while (n != 2 && n != 1) {
                System.out.println("Novo calculo (1-sim 2-nao)");
                n = input.nextInt();
                if (n == 1 || n == 2) {
                    novoGrenal = n;
                } else {
                    System.out.println("Novo calculo (1-sim 2-nao)");
                    n = input.nextInt();
                }
            }
            grenais++;
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        if(vitoriaInter > vitoriaGremio){
            System.out.println("Inter venceu mais");
        } else if (vitoriaGremio > vitoriaInter){
            System.out.println("Gremio venceu mais");
        } else if (vitoriaGremio == vitoriaInter) {
            System.out.println("Nao houve vencedor");
        }
    }
}
