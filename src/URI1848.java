import java.util.Scanner;

public class URI1848 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String corvo;
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            int flag = 0;
            while (flag == 0) {
                corvo = input.nextLine();
                switch (corvo) {
                    case "--*":
                        soma += 1;
                        break;
                    case "-*-":
                        soma += 2;
                        break;
                    case "*--":
                        soma += 4;
                        break;
                    case "-**":
                        soma += 3;
                        break;
                    case "*-*":
                        soma += 5;
                        break;
                    case "**-":
                        soma += 6;
                        break;
                    case "***":
                        soma += 7;
                        break;
                    default:
                        flag = 1;
                        break;

                }
            }
            System.out.println(soma);
        }
    }
}

