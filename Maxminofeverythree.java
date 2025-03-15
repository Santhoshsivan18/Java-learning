import java.util.*;

public class Maxminofeverythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        boolean f = false;
        while (!a.isEmpty()) {
            if (f) {
                System.out.println("Min");
                int c = 0;
                while (!a.isEmpty()) {
                    if (a.size() == 2) {
                        min = a.get(0) < a.get(1) ? a.get(0) : a.get(1);
                        b.add(min);
                        System.out.print("b " + b);
                        System.out.println();
                        a.clear();
                    } else if (a.size() == 1) {
                        b.add(a.get(0));
                        System.out.print("b " + b);
                        System.out.println();
                        a.clear();
                    } else {
                        while (c != 3) {
                            min = a.get(0) < min ? a.get(0) : min;
                            a.remove(0);
                            System.out.print("a " + a);
                            System.out.println();
                            c++;
                        }
                        b.add(min);
                        System.out.print("b " + b);
                        System.out.println();
                        c = 0;
                    }
                }
                f = false;
            } else {
                int c = 0;
                System.out.println("Max");
                while (!a.isEmpty()) {
                    switch (a.size()) {
                        case 2:
                            max = a.get(0) > a.get(1) ? a.get(0) : a.get(1);
                            b.add(max);
                            System.out.print("b " + b);
                            System.out.println();
                            a.clear();
                            break;
                        case 1:
                            b.add(a.get(0));
                            System.out.print("b " + b);
                            System.out.println();
                            a.clear();
                            break;
                        default:
                            while (c != 3) {
                                max = a.get(0) > max ? a.get(0) : max;
                                a.remove(0);
                                System.out.print("a " + a);
                                System.out.println();
                                c++;
                            }   b.add(max);
                            System.out.print("b " + b);
                            System.out.println();
                            c = 0;
                            break;
                    }
                }
                f = true;
            }
            if (b.size() == 1) {
                System.out.println(b);
                break;
            }
            if (a.isEmpty()) {
                a.addAll(b);
                b.clear();
            }
        }
    }
}