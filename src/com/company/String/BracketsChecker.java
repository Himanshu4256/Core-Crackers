package com.company.String;

import java.util.Stack;

public class BracketsChecker {
    public static int isValid(String A) {
        Stack<Character> stack = new Stack<>();

        for (char c : A.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return 0;
                }
            }
        }
        //if empty to 1, otherwise 0
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        String input = "{[[()]]}";
        int result = isValid(input);
        System.out.println("Is valid: " + (result == 1));
    }
}


