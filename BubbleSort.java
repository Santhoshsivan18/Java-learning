// import java.util.*;

// public class Bubble_sort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         List<Integer> l = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//             int n = sc.nextInt();
//             l.add(n);
//         }
//         // while (sc.hasNextInt()) {
//         // int n = sc.nextInt();
//         // l.add(n);
//         // }
//         System.out.println("Before sorting: " + l);
//         for (int i = 0; i < l.size() - 1; i++) {
//             for (int j = i+1; j < l.size(); j++) {
//                 if (l.get(i) > l.get(j)) {
//                     int temp = l.get(i);
//                     l.set(i, l.get(j));
//                     l.set(j, temp);
//                 }
//             }
//         }
//         System.out.println("After sorting: " + l);
//         sc.close();
//     }
// }

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            l.add(element);
        }

        System.out.println("Before sorting: " + l);
        boolean swapped;
        for (int i = 0; i < l.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < l.size() - i - 1; j++) {
                if (l.get(j) > l.get(j + 1)) {
                    Collections.swap(l, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println("After sorting: " + l);
        sc.close();
    }
}
