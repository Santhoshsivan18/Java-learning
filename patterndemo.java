public class patterndemo {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < n; j++) { // column
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        n = 3;
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < i + 1; j++) { // column
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        n = 4;
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < n - i; j++) { // column
                System.out.print(" " + (j + 1));
            }
            System.out.println();
        }
        System.out.println();
        n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
