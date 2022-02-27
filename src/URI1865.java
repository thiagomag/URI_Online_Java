import java.util.Scanner;

public class URI1865 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            String nome = input.next();
            int forca = input.nextInt();
            System.out.println(levantarMjolnor(nome));
        }
    }

    private static String levantarMjolnor(String nome) {
       return nome.equals("Thor") ? "Y" : "N";
    }
}
