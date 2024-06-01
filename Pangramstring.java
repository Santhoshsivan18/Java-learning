import java.util.*;

public class Pangramstring {
    public static void main(String[] args) {
        String s = "Pack mY box witH five dozen liquor jugs";

        // checking pangram using array
        // char[] c = s.toCharArray();
        // char t;
        // int index = 0;
        // int[] a = new int[26];
        // for (int i = 0; i < c.length; i++) {
        // if (Character.isAlphabetic(c[i])) {
        // t = Character.toLowerCase(c[i]);
        // index = (int) t - 97;
        // a[index] = 1;
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] == 0) {
        // System.out.print("Not a pangram");
        // break;
        // } else {
        // System.out.print("Pangram");
        // break;
        // }
        // }

        // checking pangram using hashset
        HashSet<Character> st = new HashSet<Character>();
        s = s.toLowerCase();
        // for (int i = 0; i < s.length(); i++) {
        for (char ch : s.toCharArray()) {
            // if (s.charAt(i) != ' ') {
            if (ch != ' ') {
                // st.add(s.charAt(i));
                st.add(ch);
            }
        }
        if (st.size() == 26) {
            System.out.print("Pangram");
        } else {
            System.out.print(" Not Pangram");
        }
    }
}