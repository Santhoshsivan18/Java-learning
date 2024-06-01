import java.util.*;

public class ArrayFunctionsExample {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = { 4, 2, 8, 1, 6, 3, 7 };

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sorting the array
        // Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching for an element
        int searchElement = 6;
        int index = Arrays.binarySearch(numbers, searchElement);
        System.out.println("Index of " + searchElement + ": " + index);

        // Filling the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copying elements from one array to another
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Checking for equality of two arrays
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Arrays are equal: " + isEqual);

        // Finding the minimum and maximum values in the array
        int min = Arrays.stream(numbers).min().orElseThrow();
        int max = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("Min: " + min + ", Max: " + max);

        // Converting array to a string
        String arrayAsString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayAsString);

        // Generating a hash code for the array
        int hashCode = Arrays.hashCode(numbers);
        System.out.println("Array Hash Code: " + hashCode);
    }
}
