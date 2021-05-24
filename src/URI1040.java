import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        float n4 = input.nextFloat();

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;

        if(media >= 6.0){
            System.out.printf("Media: %.1f\nAluno aprovado.\n", media);
        } else if(media < 5.0){
            System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
        } else {
            System.out.printf("Media: %.1f\nAluno em exame.\n", media);
            float n5 = input.nextFloat();
            float mediaFinal = (media + n5) / 2;
            if(mediaFinal >= 5.0) {
                System.out.printf("Nota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n",n5, mediaFinal);
            } else {
                System.out.printf("Nota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n",n5, mediaFinal);
            }
        }
    }
}
