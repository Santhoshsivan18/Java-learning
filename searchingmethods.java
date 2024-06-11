import java.util.*;

public class searchingmethods {
    public static void main(String[] args) {
        int[] a = {8, 2, 9, 3, 1, 6, 4};
        int t = 4, flag = -1; // Initialize flag to -1 to indicate element not found

        // Linear Search
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                flag = i;
                break;  // Exit loop once the element is found
            }
        }
        System.out.println((flag != -1) ? "Element found at index " + (flag + 1) : "Element not found");

        // Binary Search
        Arrays.sort(a);  // Binary search requires a sorted array
        int left = 0, right = a.length - 1;
        flag = -1;  // Reset flag for binary search

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == t) {
                flag = mid;
                break;  // Exit loop once the element is found
            } else if (a[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println((flag != -1) ? "Element found at index " + (flag + 1) : "Element not found");
    }
}
