import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.next();
        int diaInicial = input.nextInt();
        int horaInicial = input.nextInt();
        input.next();
        int minInicial = input.nextInt();
        input.next();
        int segInicial = input.nextInt();

        input.next();
        int diaFinal = input.nextInt();
        int horaFinal = input.nextInt();
        input.next();
        int minFinal = input.nextInt();
        input.next();
        int segFinal = input.nextInt();

        duracaoEvento(diaInicial, horaInicial, minInicial, segInicial, diaFinal, horaFinal, minFinal, segFinal);

    }

    private static void duracaoEvento(int diaInicial, int horaInicial, int minInicial, int segInicial, int diaFinal, int horaFinal, int minFinal, int segFinal) {
        int duracaoDias = 0;
        int duracaoHoras = 0;
        int duracaoMin = 0;
        int duracaoSeg = 0;
        if (diaFinal >= diaInicial) {
            if (horaFinal >= horaInicial) {
                if (minFinal >= minInicial) {
                    if (segFinal >= segInicial) {
                        duracaoDias = diaFinal - diaInicial;
                        duracaoHoras = horaFinal - horaInicial;
                        duracaoMin = minFinal - minInicial;
                        duracaoSeg = segFinal - segInicial;
                    } else {
                        duracaoDias = diaFinal - diaInicial - 1;
                        if (horaInicial == horaFinal) {
                            duracaoHoras = 24 + horaFinal - horaInicial - 1;
                        } else {
                            duracaoHoras = horaFinal - horaInicial - 1;
                        }
                        if (minInicial == minFinal) {
                            duracaoMin = 60 + minFinal - minInicial - 1;
                        } else {
                            duracaoMin = minFinal - minInicial - 1;
                        }
                        duracaoSeg = 60 + segFinal - segInicial;
                    }
                } else {
                    duracaoDias = diaFinal - diaInicial - 1;
                    if (horaInicial == horaFinal) {
                        duracaoHoras = 24 + horaFinal - horaInicial - 1;
                    } else {
                        duracaoHoras = horaFinal - horaInicial - 1;
                    }
                    if (segFinal >= segInicial) {
                        duracaoSeg = segFinal - segInicial;
                        duracaoMin = 60 + minFinal - minInicial;
                    } else {
                        duracaoSeg = 60 + segFinal - segInicial;
                        duracaoMin = 60 + minFinal - minInicial - 1;
                    }
                }
            } else {
                duracaoDias = diaFinal - diaInicial - 1;
                if(segFinal >= segInicial){
                    if(minFinal >= minInicial){
                        duracaoMin = minFinal - minInicial;
                        duracaoSeg = segFinal - segInicial;
                        duracaoHoras = 24 + horaFinal - horaInicial;
                    } else {
                        duracaoMin = 60 + minFinal - minInicial;
                        duracaoSeg = segFinal - segInicial;
                        duracaoHoras = 24 + horaFinal - horaInicial - 1;
                    }
                } else {
                    if(minFinal >= minInicial){
                        duracaoMin = minFinal - minInicial - 1;
                        duracaoSeg = 60 + segFinal - segInicial;
                        duracaoHoras = 24 + horaFinal - horaInicial;
                    } else {
                        duracaoMin = 60 + minFinal - minInicial - 1;
                        duracaoSeg = 60 + segFinal - segInicial;
                        duracaoHoras = 24 + horaFinal - horaInicial - 1;
                    }
                }
            }
        }
        System.out.printf("%d dia(s)\n" +
                "%d hora(s)\n" +
                "%d minuto(s)\n" +
                "%d segundo(s)\n", duracaoDias, duracaoHoras, duracaoMin, duracaoSeg);
    }
}
