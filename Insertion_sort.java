import java.util.*;

public class Insertion_sort {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(14, 33, 27, 10, 35, 19, 44, 42));
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no.of elements: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        // int num = sc.nextInt();
        // l.add(num);
        // }
        System.out.println("Before sorting: " + l);
        for (int i = 1; i < l.size(); i++) {
            int key = l.get(i);
            int j = i - 1;
            int current;
            while (j >= 0 && (current = l.get(j)) > key) {
                l.set(j + 1, current);
                j--;
            }
            l.set(j + 1, key);
            System.out.println("After Step " + i + ":" + l);
        }
        System.out.println("After sorting: " + l);
    }
}
