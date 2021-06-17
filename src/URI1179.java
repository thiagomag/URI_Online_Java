import java.util.Scanner;

public class URI1179 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int countPar = 0;
        int countImpar = 0;

        for (int i = 1; i <= 15; i++) {
            int n = input.nextInt();
            if(n % 2 == 0){
                par[countPar] = n;
                countPar++;
            } else {
                impar[countImpar] = n;
                countImpar++;
            }
            if(countImpar == 5 || i == 15){
                for (int j = 0; j < countImpar; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
                countImpar = 0;
            }
            if(countPar == 5 || i == 15){
                for (int j = 0; j < countPar; j++){
                    System.out.println("par["+ j + "] = " + par[j]);
                }
                countPar = 0;
            }
        }
    }
}
