package com.hemanth.dsusingjava.stack.usinglinkedlist;

public class LinkedListStack {

    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (!isEmpty()) {
            int value = top.data;
            top = top.next;
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }

    public boolean isEmpty() {
        return top == null;
    }


}
