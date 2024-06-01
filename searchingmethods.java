import java.util.*;

public class searchingmethods {

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary Search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid; // Return the index if found
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }

    // Interpolation Search
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key)
                    return low; // Return the index if found
                return -1;
            }

            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == key) {
                return pos; // Return the index if found
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1; // Return -1 if not found
    }

    // Jump Search
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Return -1 if not found
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Exponential Search
    public static int exponentialSearch(int[] arr, int key) {
        if (arr[0] == key) {
            return 0; // Return the index if found
        }

        int i = 1;
        while (i < arr.length && arr[i] <= key) {
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), key);
    }

    // Fibonacci Search
    public static int fibonacciSearch(int[] arr, int key) {
        int n = arr.length;
        int fibMMm2 = 0; // (m-2)'th Fibonacci No.
        int fibMMm1 = 1; // (m-1)'th Fibonacci No.
        int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, n - 1);

            if (arr[i] < key) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i] > key) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else {
                return i; // Return the index if found
            }
        }

        if (fibMMm1 == 1 && arr[offset + 1] == key) {
            return offset + 1; // Return the index if found
        }

        return -1; // Return -1 if not found
    }

    // Ternary Search
    public static int ternarySearch(int[] arr, int key, int left, int right) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == key) {
                return mid1; // Return the index if found
            }
            if (arr[mid2] == key) {
                return mid2; // Return the index if found
            }

            if (key < arr[mid1]) {
                return ternarySearch(arr, key, left, mid1 - 1);
            } else if (key > arr[mid2]) {
                return ternarySearch(arr, key, mid2 + 1, right);
            } else {
                return ternarySearch(arr, key, mid1 + 1, mid2 - 1);
            }
        }
        return -1; // Return -1 if not found
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int key = 30;

        // Perform linear search
        int linearResult = linearSearch(array, key);
        System.out.println("Linear Search: Element found at index " + linearResult);

        // Perform binary search
        Arrays.sort(array); // Ensure array is sorted
        int binaryResult = binarySearch(array, key);
        System.out.println("Binary Search: Element found at index " + binaryResult);

        // Perform interpolation search
        int interpolationResult = interpolationSearch(array, key);
        System.out.println("Interpolation Search: Element found at index " + interpolationResult);

        // Perform jump search
        int jumpResult = jumpSearch(array, key);
        System.out.println("Jump Search: Element found at index " + jumpResult);

        // Perform exponential search
        int exponentialResult = exponentialSearch(array, key);
        System.out.println("Exponential Search: Element found at index " + exponentialResult);

        // Perform fibonacci search
        int fibonacciResult = fibonacciSearch(array, key);
        System.out.println("Fibonacci Search: Element found at index " + fibonacciResult);

        // Perform ternary search
        int ternaryResult = ternarySearch(array, key, 0, array.length - 1);
        System.out.println("Ternary Search: Element found at index " + ternaryResult);;
    }
}