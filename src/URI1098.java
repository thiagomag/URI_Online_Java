public class URI1098 {
    public static void main(String[] args) {
        for(double i = 0; i <= 20; i += 2){
            for(double j = 10 + i; j <= 30 + i; j += 10){
                if(i % 10 == 0){
                    int a = (int) i / 10;
                    int b = (int) j / 10;
                    System.out.printf("I=%d J=%d\n", a, b);

                } else {
                    double a = i / 10;
                    double b = j / 10;
                    System.out.printf("I=%.1f J=%.1f\n", a, b);
                }
            }
        }
    }
}
