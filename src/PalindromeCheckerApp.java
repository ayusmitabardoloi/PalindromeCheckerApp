public class PalindromePerformance {

    // Method 1: Iterative (Two Pointer)
    public static boolean iterativePalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    // Method 3: Reverse String
    public static boolean reversePalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "madamimadam";

        // Iterative performance
        long start1 = System.nanoTime();
        iterativePalindrome(input);
        long end1 = System.nanoTime();

        // Recursive performance
        long start2 = System.nanoTime();
        recursivePalindrome(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        // Reverse string performance
        long start3 = System.nanoTime();
        reversePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("Iterative Time: " + (end1 - start1) + " ns");
        System.out.println("Recursive Time: " + (end2 - start2) + " ns");
        System.out.println("Reverse String Time: " + (end3 - start3) + " ns");
    }
}
