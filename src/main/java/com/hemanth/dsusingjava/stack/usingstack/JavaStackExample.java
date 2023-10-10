package com.hemanth.dsusingjava.stack.usingstack;

import java.util.Stack;

public class JavaStackExample {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.peek()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false


    }
}
