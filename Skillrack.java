import java.util.*;

public class Skillrack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        String s = sc.nextLine();
        String[] q = s.split(" ");
        int n = Integer.parseInt(q[0]);
        for (int j = 1; j < q.length; j++) {
            n = (n * 10) + Integer.parseInt(q[j]);
        }
        System.out.println(n);
        n += 1;
        int len = (int) Math.log10(n) + 1;
        System.out.print(len);
        // left to right
        int f = n, l = q.length - 1, r = 0;
        for(int i = 0; i < q.length; i++) {
            r = f / (int) Math.pow(10, l);
            a.add(r);
            f -= (r * (int) Math.pow(10, l));
            l--;
        }
        // right to left
        // while(n!=0)
        // {
        // a.add(n%10);
        // n/=10;
        // }
        // Collections.reverse(a);
        System.out.print(a);
    }
}