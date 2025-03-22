import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        // Check if the stack is empty after pushing all opening brackets
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (pop == '(' && s.charAt(i) != ')'
                        || pop == '{' && s.charAt(i) != '}'
                        || pop == '[' && s.charAt(i) != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
