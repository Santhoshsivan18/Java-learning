public class Stringbuilderfunctions {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Append - adds text to the end
        sb.append(" World");
        System.out.println("1. Append: " + sb);
        System.out.println("Modified string: " + sb);

        // 2. Insert - inserts text at the specified index
        sb.insert(6, "Java ");
        System.out.println("2. Insert: " + sb);
        System.out.println("Modified string: " + sb);

        // 3. Replace - replaces part of the string from startIndex to endIndex - 1
        sb.replace(6, 10, "Beautiful");
        System.out.println("3. Replace: " + sb);
        System.out.println("Modified string: " + sb);

        // 4. Delete - removes characters from startIndex to endIndex - 1
        sb.delete(0, 6);
        System.out.println("4. Delete: " + sb);
        System.out.println("Modified string: " + sb);

        // 5. Reverse - reverses the characters in the StringBuilder
        sb.reverse();
        System.out.println("5. Reverse: " + sb);
        System.out.println("Modified string: " + sb);

        // 6. Length - returns the length of the string
        int length = sb.length();
        System.out.println("6. Length: " + length);
        System.out.println("Modified string: " + sb);

        // 7. Capacity - returns the current capacity
        int capacity = sb.capacity();
        System.out.println("7. Capacity: " + capacity);
        System.out.println("Modified string: " + sb);

        // 8. Ensure Capacity - ensures the capacity is at least equal to the specified minimum
        sb.ensureCapacity(50);
        System.out.println("8. Ensure Capacity: " + sb.capacity());
        System.out.println("Modified string: " + sb);

        // 9. Set Length - sets the length of the character sequence
        sb.setLength(5);
        System.out.println("9. Set Length: " + sb);
        System.out.println("Modified string: " + sb);

        // 10. CharAt - returns the char value in this sequence at the specified index
        char charAt = sb.charAt(0);
        System.out.println("10. CharAt index 0: " + charAt);
        System.out.println("Modified string: " + sb);

        // 11. Substring - returns a new String that contains a subsequence of characters
        String substring = sb.substring(1, 5);
        System.out.println("11. Substring from 1 to 5: " + substring);
        System.out.println("Modified string: " + sb);

        // 12. TrimToSize - attempts to reduce storage used for the character sequence
        sb.trimToSize();
        System.out.println("12. TrimToSize: " + sb.capacity());
        System.out.println("Modified string: " + sb);

        // 13. SetCharAt - sets the character at the specified position
        sb.setCharAt(0, 'W');
        System.out.println("13. SetCharAt: " + sb);
        System.out.println("Modified string: " + sb);
    }
}
