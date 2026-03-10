class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        if (checker.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
