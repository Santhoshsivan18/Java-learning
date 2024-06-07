n = 5;
        System.out.println("9. Hourglass Pattern");
        for (int i = 1; i < (n*2); i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }