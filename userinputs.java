import java.util.*;
import java.lang.*;
public class userinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double dnum = sc.nextDouble();
        String name = sc.next();
        // int[] array = {1,2,3,4,5};
        // String[] array = {"1","2","3","4","5"};
        int[] array = new int[5];
        for(int i : array){
            array[i] = sc.nextInt();
        }
        System.out.println(array.length);
        // Arrays.get(array,2);
        // Arrays.sort(array); 
    }
}
