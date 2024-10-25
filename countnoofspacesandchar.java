
import java.util.Scanner;

public class countnoofspacesandchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ch = 0, sp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sp++;
            }
            if (Character.isAlphabetic(s.charAt(i))) {
                ch++;
            }
        }
        System.out.println("Characters :" + ch);
        System.out.println("Spaces :" + sp);
    }
}
