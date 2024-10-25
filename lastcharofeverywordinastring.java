
import java.util.*;

public class lastcharofeverywordinastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String w = s1[i];
            char ch = w.charAt(w.length()-1);
            if(Character.isDigit(ch)){
                continue;
            }
        }
    }
}
