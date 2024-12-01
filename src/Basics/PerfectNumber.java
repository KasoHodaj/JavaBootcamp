package Basics;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPerfectNumber(6));   // Expected: true
        System.out.println(isPerfectNumber(28));  // Expected: true
        System.out.println(isPerfectNumber(5)); // Expected: false
        System.out.println(isPerfectNumber(-1));// Expected: false
    }
}