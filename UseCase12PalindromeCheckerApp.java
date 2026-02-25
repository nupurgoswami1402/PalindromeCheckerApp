import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// Main Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeContext context = new PalindromeContext();

        // Choose strategy dynamically
        context.setStrategy(new StackStrategy());
        boolean result1 = context.execute(input);

        context.setStrategy(new DequeStrategy());
        boolean result2 = context.execute(input);

        System.out.println("Input text: " + input);
        System.out.println("Stack Strategy Result: " + result1);
        System.out.println("Deque Strategy Result: " + result2);
    }
}
