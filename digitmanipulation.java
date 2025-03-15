import java.util.Scanner;

public class digitmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Extract a digit from a specific position (1-based indexing from right)
        int position = 2;
        int divisor = (int) Math.pow(10, position - 1);
        int extractedDigit = (number / divisor) % 10;
        System.out.println("Digit at position " + position + ": " + extractedDigit);

        // Increment each digit by 1
        int tempNumber = number, incrementedNumber = 0, digit;
        while (tempNumber > 0) {
            digit = tempNumber % 10;
            digit++;
            incrementedNumber = incrementedNumber * 10 + digit;
            tempNumber /= 10;
        }

        // Reverse the incremented number to restore the correct order
        int correctedIncrementedNumber = 0;
        tempNumber = incrementedNumber;
        while (tempNumber > 0) {
            digit = tempNumber % 10;
            correctedIncrementedNumber = correctedIncrementedNumber * 10 + digit;
            tempNumber /= 10;
        }
        System.out.println("Number with each digit incremented by 1: " + correctedIncrementedNumber);

        // Decrement each digit by 1
        tempNumber = number;
        int decrementedNumber = 0;
        while (tempNumber > 0) {
            digit = tempNumber % 10;
            digit--;
            decrementedNumber = decrementedNumber * 10 + digit;
            tempNumber /= 10;
        }

        // Reverse the decremented number to restore the correct order
        int correctedDecrementedNumber = 0;
        tempNumber = decrementedNumber;
        while (tempNumber > 0) {
            digit = tempNumber % 10;
            correctedDecrementedNumber = correctedDecrementedNumber * 10 + digit;
            tempNumber /= 10;
        }
        System.out.println("Number with each digit decremented by 1: " + correctedDecrementedNumber);

        // Reversing digits
        int reversedNumber = 0;
        tempNumber = number;
        while (tempNumber != 0) {
            digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);

        // Sum of Digits from right to left
        tempNumber = number;
        int sumRightToLeft = 0;
        while (tempNumber != 0) {
            sumRightToLeft += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Sum of digits (right to left): " + sumRightToLeft);

        // Sum of Digits from left to right
        tempNumber = number;
        int sumLeftToRight = 0;
        int length = (int) Math.log10(number) + 1; // Length of the number
        for (int i = length - 1; i >= 0; i--) {
            // System.out.println(tempNumber / Math.pow(10, i));
            // System.out.println((tempNumber / Math.pow(10, i))%10);
            digit = (int) (tempNumber / Math.pow(10, i)) % 10;
            sumLeftToRight += digit;
        }
        System.out.println("Sum of digits (left to right): " + sumLeftToRight);
    }
}
