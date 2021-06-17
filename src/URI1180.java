import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final var n = input.nextInt();
        int[] arr = new int[n];
        arr[0] = input.nextInt();
        int menor = arr[0];
        int pos = -1;
        for (int i = 1; i < arr.length; i++){
            arr[i] = input.nextInt();
            if(arr[i] < menor){
                menor = arr[i];
                pos = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pos);
    }
}
