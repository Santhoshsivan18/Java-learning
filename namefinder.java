import java.util.*;

public class namefinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('A', 1);
        hashmap.put('B', 2);
        hashmap.put('C', 3);
        hashmap.put('D', 4);
        hashmap.put('E', 5);
        hashmap.put('F', 8);
        hashmap.put('G', 3);
        hashmap.put('H', 5);
        hashmap.put('I', 1);
        hashmap.put('J', 1);
        hashmap.put('K', 2);
        hashmap.put('L', 3);
        hashmap.put('M', 4);
        hashmap.put('N', 5);
        hashmap.put('O', 7);
        hashmap.put('P', 8);
        hashmap.put('Q', 1);
        hashmap.put('R', 2);
        hashmap.put('S', 3);
        hashmap.put('T', 4);
        hashmap.put('U', 6);
        hashmap.put('V', 6);
        hashmap.put('W', 6);
        hashmap.put('X', 5);
        hashmap.put('Y', 1);
        hashmap.put('Z', 7);

        System.out.println("Enter name :");
        String inputString = sc.nextLine();
        String uppercaseString = inputString.toUpperCase().trim();

        int sum = 0;
        for (char c : uppercaseString.toCharArray()) {
            if (hashmap.containsKey(c)) {
                sum += hashmap.get(c);
            }
        }

        // System.out.println("Sum of values for characters in the string without S/P: "
        // + sum);
        // System.out.println("Sum of values for characters in the string with initial
        // S: " + (sum + 3));
        // System.out.println("Sum of values for characters in the string with initial
        // P: " + (sum + 8));
        // System.out.println("Sum of values for characters in the string with initial S
        // & P: " + (sum + 11));

        int Ssum = String.valueOf(sum + 3).chars().map(Character::getNumericValue).sum();
        int Psum = String.valueOf(sum + 8).chars().map(Character::getNumericValue).sum();
        int SPsum = String.valueOf(sum + 11).chars().map(Character::getNumericValue).sum();
        // System.out.println(Ssum + " " + Psum + " " + SPsum);
        boolean flag = false;
        if (Ssum == 6 || Ssum == 9) {
            flag = true;
            System.out.println();
            System.out.println("S." + inputString);
            System.out.println();
        }
        if (Psum == 6 || Psum == 9) {
            flag = true;
            System.out.println();
            System.out.println("P." + inputString);
            System.out.println();
        }
        if (SPsum == 6 || SPsum == 9) {
            flag = true;
            System.out.println();
            System.out.println("S.P." + inputString);
            System.out.println();
        }
        if (!flag) {
            System.out.println();
            System.out.println("It's not suitable. Try another name");
            System.out.println();
        }
    }
}
