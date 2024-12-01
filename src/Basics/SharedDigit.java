package Basics;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {
        /**
         * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
         * If one of the numbers is not within the range, the method should return false.
         *
         * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
         * otherwise, the method should return false.
         */

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23));   // Expected: true
        System.out.println(hasSharedDigit(9, 99));  // Expected: false
        System.out.println(hasSharedDigit(35,65)); // Expected: true
        System.out.println(hasSharedDigit(15, 55));   // Expected: true
    }
}
