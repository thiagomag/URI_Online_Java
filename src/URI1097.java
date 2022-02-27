public class URI1097 {
    public static void main(String[] args) {
        int n = 2;
        for(int i = 1; i <= 9; i+=2){
            for(int j = 5+n; j >= 3+n; j-=1){
                System.out.printf("I=%d J=%d\n", i, j);
            }
            n += 2;
        }
    }
}
