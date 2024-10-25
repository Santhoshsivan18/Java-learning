
import java.util.*;

public class findcharatoddindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 1; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==1){
                System.out.print(s.charAt(i));
            }
        }
    }
}
