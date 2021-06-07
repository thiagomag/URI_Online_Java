import java.util.Scanner;

public class URI1150 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z;
        do {
            z = input.nextInt();
        } while(x >= z);
        soma(x, z);
    }

    private static void soma(int x, int z) {
        int soma = 0;
        int cont = 0;
        for(int i = x; i < z; i++){
            if(soma > z){
                break;
            }else {
                soma += i;
                cont++;
            }
        }
        System.out.println(cont);
    }
}
