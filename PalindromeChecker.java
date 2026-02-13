import java.util.Scanner;

public class PalindromeChecker {
    public static final String APP_NAME = "Palindrome Checker";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== " + APP_NAME + " ===");
        System.out.println("Version: " + VERSION);
        System.out.println();
        System.out.println("Welcome to the Palindrome Checker app.");
        System.out.println("This console application validates whether a given string is a palindrome.");
        System.out.println();

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return false;
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}