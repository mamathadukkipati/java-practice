import java.util.Stack;

public class ReverseString5 {
    public static void main(String[] args) {

        String str = "manoj";

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();

        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        System.out.println("Reversed String: " + reverse);
    }
}