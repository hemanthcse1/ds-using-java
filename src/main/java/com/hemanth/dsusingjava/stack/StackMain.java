package com.hemanth.dsusingjava.stack;

import com.hemanth.dsusingjava.stack.usingarray.ArrayStack;
import com.hemanth.dsusingjava.stack.usinglinkedlist.LinkedListStack;

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

        // using linked list
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(5);
        linkedListStack.push(6);
        linkedListStack.push(8);
        linkedListStack.push(19);

        linkedListStack.pop();

        System.out.println(linkedListStack.peek());


    }
}
