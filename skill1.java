public class skill1 {
    public static void main(String[] args) {
        int n = 5, t = 1;
        long p = 0, q = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print((t % 2 != 0) ? "+" : "*");
                }
                p += j;
                q *= j;
            }
            System.out.println("=" + ((t % 2 != 0) ? p : q));
            t++;
            p = 0;
            q = 1;
        }
    }
}