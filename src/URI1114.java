import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha = input.nextInt();
        while(!validacaoSenha(senha)){
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }
        System.out.println("Acesso Permitido");

    }

    private static boolean validacaoSenha(int senha) {
        return senha == 2002;
    }
}
