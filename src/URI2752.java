public class URI2752 {
    public static void main(String[] args) {
        String s = "AMO FAZER EXERCICIO NO URI";

        System.out.printf("<%s>\n", s);
        System.out.printf("<%30s>\n", s);
        System.out.printf("<%.20s>\n", s);
        System.out.printf("<%-20s>\n", s);
        System.out.printf("<%-30s>\n", s);
        System.out.printf("<%.30s>\n", s);
        System.out.printf("<%30.20s>\n", s);
        System.out.printf("<%-30.20s>\n", s);
    }
}
