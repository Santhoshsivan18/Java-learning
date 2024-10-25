
import java.util.Scanner;

public class printvowelin0thindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String t = s1[i];
            char ch = t.charAt(0);
            for (char j : a) {
                if (ch == j) {
                    System.out.println(i + " " + ch);
                }
            }
        }
    }
}
