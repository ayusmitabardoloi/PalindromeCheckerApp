public class PalindromePerformanceComparison {

    // Method 1: Iterative approach
    public static boolean iterativePalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive approach
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    // Method 3: Reverse String approach
    public static boolean reversePalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "madamimadam";

        // Iterative timing
        long startTime = System.nanoTime();
        iterativePalindrome(input);
        long endTime = System.nanoTime();
        System.out.println("Iterative Method Time: " + (endTime - startTime) + " ns");

        // Recursive timing
        startTime = System.nanoTime();
        recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Method Time: " + (endTime - startTime) + " ns");

        // Reverse string timing
        startTime = System.nanoTime();
        reversePalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Reverse String Method Time: " + (endTime - startTime) + " ns");
    }
}
