import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Welcome to Palindrome Checker App =====");

        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome ✅");
        } else {
            System.out.println(input + " is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}
