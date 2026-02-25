class PalindromeChecker {

    // Encapsulated method
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Object creation
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + result);
    }
}
