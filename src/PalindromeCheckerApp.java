import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();
        boolean isPalindrome = true;

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}