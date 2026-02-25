public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a camel panama";

        // Normalize string: remove spaces & convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = processed.length() - 1;

        // Compare characters
        while (start < end) {
            if (processed.charAt(start) != processed.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original text: " + input);
        System.out.println("Processed text: " + processed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
