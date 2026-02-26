import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class UC6Queue {
    public static void main(String[] args) {
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // front element
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
