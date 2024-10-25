import java.util.*;

public class largestandsmallestwordinaline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String largest = "", smallest = "";
        boolean isFirstWord = true;
        for (String word : s.split(" ")) {
            if (isFirstWord) {
                largest = smallest = word;
                isFirstWord = false;
            } else {
                if (word.length() > largest.length()) {
                    largest = word;
                } else if (word.length() < smallest.length()) {
                    smallest = word;
                }
            }
        }
        System.out.println("Largest word: " + largest);
        System.out.println("Smallest word: " + smallest);
    }
}
