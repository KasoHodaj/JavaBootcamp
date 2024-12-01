package Basics;


public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) return false;

        int reverse = 0;

        // Reverse only half of the number
        while (number > reverse) {
            reverse = reverse * 10 + number % 10; // last digit of number is first number of reverse
            number /= 10;
        }

        // Check for palindrome
        return number == reverse || number == reverse / 10;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121));   // Expected: true
        System.out.println(isPalindrome(-121));  // Expected: false
        System.out.println(isPalindrome(12321)); // Expected: true
        System.out.println(isPalindrome(123));   // Expected: false
    }
}
