import java.util.Scanner;

public class URI1847 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp1 = input.nextInt();
        int temp2 = input.nextInt();
        int temp3 = input.nextInt();
        bemVindoAoInverno(temp1, temp2, temp3);
    }

    private static void bemVindoAoInverno(int temp1, int temp2, int temp3) {
        if(temp1 > temp2 && temp2 <= temp3 ||
                temp2 > temp1 && (temp2 - temp1) <= (temp3 - temp2) ||
                temp1 > temp2 && (temp1 - temp2) > (temp2 - temp3) ||
                temp1 == temp2 && temp2 < temp3) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}
