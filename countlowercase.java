import java.util.*;

public class countlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            // if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            //     c++;
            // }
            if(Character.isLowerCase(s.charAt(i))){
                c++;
            }
        }
        System.out.println(c);
    }
}
