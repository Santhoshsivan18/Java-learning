
import java.util.Scanner;

public class indexpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        for (int idx = 0; idx < s.length(); idx++) {
            if(s.charAt(idx) == ch ){
                System.out.println(idx);
                break;
            }
        }
    }
}
