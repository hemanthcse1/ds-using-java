package com.hemanth.dsusingjava.linkedlist;

public class LInkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.display(); // Output: 0 -> 1 -> 2 -> 3 -> null
        linkedList.delete(2);
        linkedList.display(); // Output: 0 -> 1 -> 3 -> null
    }
}
