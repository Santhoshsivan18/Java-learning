import java.util.*;

public class Selection_sort {
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
        for (int i = 0; i < l.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j) < l.get(min_index)) {
                    min_index = j;
                }
            }
            Collections.swap(l, i, min_index);
            System.out.println("After Step " + i + ":" + l);
        }
        System.out.println("After sorting: " + l);
    }
}
