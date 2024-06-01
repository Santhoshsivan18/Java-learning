import java.util.*;
import java.util.stream.Stream;

public class javastreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,7,2,9,4,3,1);
        
        /*
        actions to be performed 
        normal method
        int sum=0;
        for(int n: nums){
            if(n%2==0){
                n*=2;
                sum=sum+n;
            }
        }
        System.out.println(sum);
        */

        //stream method
        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2=s1.filter(n -> n%2==0);
        Stream<Integer> s3=s2.map(n -> n*2);
        // int res = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(res);
        System.out.println("Operated nums");
        s3.forEach(n -> System.out.print(n+" "));
        System.out.println();

        // int r=nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0,(c,e) -> c+e);
        // System.out.println(r);

        /*
        Normal for loop
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        } 
        */

        /*
        Enhanced for loop
         for(int n:nums){
            System.out.println(n);
         }
         */

         /*foreach method */
        System.out.println("Original nums");
        nums.forEach(n -> System.out.print(n+" "));

    }
}
