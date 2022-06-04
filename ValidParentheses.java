class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        } else if (s.length() == 1) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else if (stack.size() == 0) {
                return false;
            } else if (a == ')') {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (a == '}') {
                if (stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (a == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
