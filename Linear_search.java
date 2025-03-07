import java.util.Arrays;

public class Linear_search {
    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>(Arrays.asList(18,12,9,14,77,50));
        // int[] n = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int[][] n1 = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };
        int target = 56;
        int[] ans = search2(n1, target);
        // System.out.println("Element found at index: " + search(n, target));
        System.out.println("Element found at index: " + Arrays.toString(ans));
        // System.out.println("Minimum Element: " + min(n));
    }

    public static int[] search2(int[][] arr, int target) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        // int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}
