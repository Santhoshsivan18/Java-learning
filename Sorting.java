
public class Sorting {

    // Optimized Selection Sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    // Optimized Bubble Sort
    // Time Complexity: O(n^2) in worst case, O(n) in best case
    // Space Complexity: O(1)
    public static void BubbleSort(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // Array is sorted
        }
    }

    // Optimized Insertion Sort
    // Time Complexity: O(n^2) in worst case, O(n) in best case
    // Space Complexity: O(1)
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Display Array
    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Optimized Sort (Selection Sort)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void sort(int arr[]) {
        SelectionSort(arr); // Reusing SelectionSort for consistency
    }

    // Merge function for Merge Sort
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void merge(int a[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (int i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = beg;
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    // Optimized Merge Sort
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    // Optimized Quick Sort
    // Time Complexity: O(n log n) on average, O(n^2) in worst case
    // Space Complexity: O(log n) due to recursion stack
    public static void quickSort(int arr[], int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    // Swap function
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 7, 3, 5, 1 };
        quickSort(arr, 0, arr.length - 1);
        display(arr);
    }
}
