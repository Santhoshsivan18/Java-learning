import java.util.*;

public class sortingmethods {
    public static void main(String[] args) {
        int[] a = {8, 2, 9, 3, 1, 6, 4};
        // array length is 7

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(a));

        //bubble sort
        int[] bubble = Arrays.copyOf(a, a.length);
        for(int i=0; i<bubble.length; i++){
            for(int j=0; j<bubble.length-i-1; j++){
                if(bubble[j] > bubble[j+1]){
                    int t = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = t;
                }
                System.out.println(Arrays.toString(bubble));
            }
        }
        System.out.println("Bubble Sort: ");
        System.out.println(Arrays.toString(bubble));


    }
}
