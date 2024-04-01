public class P3 {
    static void Pattern2(int N) {
        for(int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N  = 5;
        Pattern2(N);
    }
}