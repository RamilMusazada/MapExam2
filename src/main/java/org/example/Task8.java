package org.example;

import java.util.Stack;

public class Task8 {
    public static void main(String[] args) {
        String cumle = "Salam , bu gun imtahanim var";
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < cumle.length() ; i++){
            stack.push(cumle.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
