import java.util.*;
public class Main {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> a=new ArrayList<>();
    for(int i=0;i<n;i++){
        String s=sc.next();
        a.add(s);
    }
    System.out.print(a.toString());
    // Iterator it=a.iterator();
    // while(it.hasNext()){
    //     System.out.print(it.next()+" ");
    // }
    }
}
