import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];
        int maior = 0;
        int mediana = 0;
        int menor = 100000;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = input.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] != maior && numeros[i] != menor){
                mediana = numeros[i];
            }
        }
        System.out.println(menor);
        System.out.println(mediana);
        System.out.println(maior);

        System.out.println();

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
