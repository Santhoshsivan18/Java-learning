public class PatternPrintingExample {
    public static void main(String[] args) {
        // Basic Patterns
        System.out.println("1. Simple Patterns:");
        printSimplePattern(5);

        // Right-Angled Triangles
        System.out.println("\n2. Right-Angled Triangles:");
        printRightAngledTriangle(5);
        printInvertedRightAngledTriangle(5);

        // Pyramids
        System.out.println("\n3. Pyramids:");
        printPyramid(5);
        printInvertedPyramid(5);

        // Diamond Pattern
        System.out.println("\n4. Diamond Pattern:");
        printDiamond(5);

        // Hollow Pyramid
        System.out.println("\n5. Hollow Pyramid:");
        printHollowPyramid(5);

        // Floyd's Triangle
        System.out.println("\n6. Floyd's Triangle:");
        printFloydsTriangle(4);

        // Pascal's Triangle
        System.out.println("\n7. Pascal's Triangle:");
        printPascalsTriangle(5);
    }

    // Method to print a simple pattern
    private static void printSimplePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print a right-angled triangle
    private static void printRightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print an inverted right-angled triangle
    private static void printInvertedRightAngledTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print a pyramid
    private static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print an inverted pyramid
    private static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print a diamond pattern
    private static void printDiamond(int n) {
        printPyramid(n);
        printInvertedPyramid(n - 1);
    }

    // Method to print a hollow pyramid
    private static void printHollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to print Floyd's Triangle
    private static void printFloydsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // Method to print Pascal's Triangle
    private static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
