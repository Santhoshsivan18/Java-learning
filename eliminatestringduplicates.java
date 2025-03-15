
import java.util.*;

public class eliminatestringduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t = "";
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(t.indexOf(s.charAt(i)));
            if (t.indexOf(s.charAt(i)) == -1) {
                t += s.charAt(i);
                System.out.println(t);
            }
        }
        System.out.println(t);

        HashSet<Character> h = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            // System.out.println(h.toString());
            if (!h.contains(c)) {
                ans.append(c);
                h.add(c);
            }
        }
        System.out.println("Answer:"+ans.toString());

    }
}
