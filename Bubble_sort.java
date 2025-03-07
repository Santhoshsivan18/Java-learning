import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(14, 33, 27, 10, 35, 19, 44, 42));
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of elements:");
        // int n = sc.nextInt();

        // System.out.println("Enter the elements:");
        // for (int i = 0; i < n; i++) {
        // int element = sc.nextInt();
        // l.add(element);
        // }

        System.out.println("Before sorting: " + l);
        boolean swap;
        for (int i = 0; i < l.size(); i++) {
            swap = false;
            for (int j = 0; j < l.size() - i - 1; j++) {
                if (l.get(j) > l.get(j + 1)) {
                    Collections.swap(l, j, j + 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
            System.out.println("After Step " + i + ":" + l);
        }
        System.out.println("After sorting: " + l);
    }
}
