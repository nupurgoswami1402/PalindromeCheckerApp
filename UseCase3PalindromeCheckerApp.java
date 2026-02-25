public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        boolean isPalindrome = original.equals(reversed);

        // Display result
        System.out.println("Input text: " + original);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
