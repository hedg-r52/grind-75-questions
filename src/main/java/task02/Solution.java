package task02;

import java.util.Map;
import java.util.Stack;

public class Solution {
    final static Map<String, String> brackets = Map.of(
            ")", "(",
            "}", "{",
            "]", "["
    );
    public boolean isValid(String s) {
        String[] inputArray = s.split("");
        Stack<String> stack = new Stack<>();
        for (String b : inputArray) {
            if (brackets.containsValue(b)) {
                stack.push(b);
            } else if (brackets.containsKey(b)) {
                if (!stack.pop().equals(brackets.get(b))) {
                    return false;
                }
            }
        }
        return true;
    }
}
