public class StringFunctionsExample {
    public static void main(String[] args) {
        // String declaration
        String str = "Hello, World!";
        System.out.println("String : " + str);

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Extracting a substring
        String substring = str.substring(7);
        System.out.println("Substring starting from index 7: " + substring);
        String substring1 = str.substring(7, 10);
        System.out.println("Substring starting from index 7 and ending at 10: " + substring1);

        // Concatenating strings
        String newString = str.concat(" Welcome!");
        System.out.println("Concatenated String: " + newString);

        // Converting to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Converting to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Checking if a string contains a specific substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Replacing characters in a string
        String replacedString = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedString);

        // Trimming leading and trailing whitespaces
        String stringWithSpaces = "   Trim me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Checking if a string starts or ends with a specific prefix/suffix
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // Index of the first occurrence of a character or substring
        int indexOfComma = str.indexOf(',');
        int indexOfSubstring = str.indexOf("World");
        System.out.println("Index of ',': " + indexOfComma);
        System.out.println("Index of 'World': " + indexOfSubstring);

        // Checking if the string is empty or not
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // Reversing the string
        StringBuilder reversedString = new StringBuilder(str).reverse();
        System.out.println("Reversed String: " + reversedString);
    }
}
