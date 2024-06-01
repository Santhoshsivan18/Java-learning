public class withoutusingloop {
    
    // Recursive method to print numbers from 1 to n
    public static void printNumbers(int n) {
        System.out.println("n val : "+n);
        if (n <= 0) {
            System.out.println("Inside if");
            return; // Base case: stop recursion when n is 0 or less
        }
        System.out.println("Inside printNumbers func");
        printNumbers(n - 1); // Recursive call with n-1
        System.out.println(n); // Print n after printing numbers from 1 to n-1
        System.out.println("func end");
    }

    public static void main(String[] args) {
        int n = 10;  // Define the value of n
        
        printNumbers(n); // Call the recursive method to print numbers from 1 to n
    }
}
