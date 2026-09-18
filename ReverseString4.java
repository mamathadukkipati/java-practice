import java.util.Stack;

public class ReverseString4 {
    public static void main(String[] args) {

        String str = "silent";

        Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reverse = "";

        // Pop elements from stack
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        System.out.println("Reversed String: " + reverse);
    }
}