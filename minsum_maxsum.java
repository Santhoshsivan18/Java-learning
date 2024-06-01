import java.util.*;
/*Here X = 645 and Y = 656.
To get the minimum possible sum,
X can be modified as 545.
Y can be modified as 555.
so the sum of 545 and 555 is 1100.
To get the maximum possible sum,
X can be modified as 646.
Y can be modified as 666.
So the sum of 646 and 666 is 1312. */

public class minsum_maxsum {
    public static void main(String[] args) {
        int x = 645, y = 656;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] a = new int[(int) Math.log10(x) + 1];
        int[] b = new int[(int) Math.log10(y) + 1];

        for(int i=0;i<a.length;i++){
            if(a[i]==6){a[i]=swap(a[i]);}
        }
        for(int i=0;i<b.length;i++){
            
        }
    }

    static int swap(int x) {
        if (x == 5) {
            return 6;
        } else {
            return 5;
        }
    }

    int as(int a[]) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            t += a[i];
        }
        return t;
    }
}
