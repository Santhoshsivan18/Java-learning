
import java.util.Scanner;

public class countnoofspaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        if(s1.length>=3){
            System.out.println(s1.length-1);
        }else{
            System.out.println("NA");
        }
    }
}
