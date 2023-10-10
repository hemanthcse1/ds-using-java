package com.hemanth.dsusingjava.stack;

import com.hemanth.dsusingjava.stack.usingarray.ArrayStack;

public class StackMain {

    public static void main(String[] args) {



        // using array
        ArrayStack arrayStack = new ArrayStack(5);

        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(7);

        arrayStack.pop();
        arrayStack.pop();
        System.out.println( arrayStack.peek());


    }
}
