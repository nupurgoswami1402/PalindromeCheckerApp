import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * UC13: Performance Comparison of Palindrome Algorithms
 */

public class UseCase13PalindromeCheckerApp {

    // 1️⃣ Reverse String Method
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // 2️⃣ Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // 3️⃣ Deque Method
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\n--- Results ---");
        System.out.println("Reverse Method Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result:   " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method Result:   " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}
