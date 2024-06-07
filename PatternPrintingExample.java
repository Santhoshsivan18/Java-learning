public class PatternPrintingExample {
    public static void main(String[] args) {
        int n;

        /*
         * 
         * i - no.of rows , outer loop
         * j - no.of columns , inner loop
         * either use index(i->rows,j->cols) as 0 or 1 (1 is more preferrable)
         * 
         * for index=0 ; for(int i=0;i<n;i++) ; i=0,1,2,3,4 ; for n=5
         * 
         * for index=1 ; for(int i=1;i<=n;i++) ; i=1,2,3,4,5 ; for n=5
         * 
         * How to approach pattern based qns
         * 1) no.of lines = no.of rows (i.e) no.of times outer loop will run
         * 2) identify in each row
         * -> how many columns are there
         * -> types of elements in the column
         * 3) what do u need to print
         * Note : Try to find the formula relating the rows and cols
         * 
         */

        n = 5;
        System.out.println("1. Square Pattern");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            // when each row is printed the control needs to goto the next line
            System.out.println();
        }
        System.out.println();

        System.out.println("2. Left Sided Triangle Pattern");
        System.out.println();

        n = 5;
        System.out.println("2.1 Left Sided Triangle Pattern with *");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("2.2 Left Sided Triangle Pattern with numbers");

        System.out.println();
        n = 5;
        System.out.println("2.2.1 Left Sided Triangle Pattern with numbers with cols in inner loop");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        System.out.println();
        n = 5;
        System.out.println("2.2.2 Left Sided Triangle Pattern with numbers with rows in inner loop");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("3. Inverted Left Triangle Pattern");
        for (int rows = 1; rows <= n; rows++) {
            // for (int cols = 1; cols <= (n - rows) + 1; cols++) {
            // for (int cols = 1; cols <= (n + 1) - rows; cols++) {
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("4. Right Sided Triangle Pattern");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = rows; cols < n; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("5. Inverted Right Triangle Pattern");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols < rows; cols++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("6. Pyramid or Hill Pattern");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = rows; cols < n; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols < rows; cols++) {
                System.out.print("* ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("7. Inverted Pyramid or Hill Pattern");
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols < rows; cols++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols < n; cols++) {
                System.out.print("* ");
            }
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n = 5;
        System.out.println("8. Diamond Pattern");
        System.out.println("8.1 1st variation Diamond Pattern");
        for (int rows = 1; rows < n; rows++) {
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols < rows; cols++) {
                System.out.print("* ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols < n; cols++) {
                System.out.print("* ");
            }
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        n=5;
        System.out.println("8.2 2nd variation Diamond Pattern");
        for (int rows = 1; rows <= (n * 2) - 1; rows++) {
            int cols = rows > n ? (n * 2) - rows : rows;
            int spaces = n - cols;
            for (int j = 0; j < spaces; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
         * * * * *
         * * *
         *
         * * *
         * * * * *
         * 
         * 
         * n = 5;
         * System.out.println("9. Hourglass Pattern");
         * 
         * System.out.println("1st Variation");
         * for (int rows = 0; rows < n; rows++) {
         * int k=1;
         * int cols = rows > n/2 ? : n - (rows * k);
         * int t = rows > n ? (2*n - rows) - 1 : rows - 1;
         * for (int spaces = 0; spaces < t; spaces++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= cols; j++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * k++;
         * }
         * 
         */
        System.out.println("9. Hourglass Pattern");

        System.out.println("2nd Variation");
        for (int rows = 1; rows < (n * 2); rows++) {
            int cols = rows > n ? (rows - n) + 1 : (n - rows) + 1;
            int t = rows > n ? (2 * n - rows) - 1 : rows - 1;
            for (int spaces = 0; spaces < t; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        n = 5;
        System.out.println("10. Diamond of Stars Pattern / Double Pyramid Pattern / Sandglass Star Pattern Pattern");
        for (int rows = 1; rows <= (n * 2) - 1; rows++) {
            int cols = rows > n ? (n * 2) - rows : rows;
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}