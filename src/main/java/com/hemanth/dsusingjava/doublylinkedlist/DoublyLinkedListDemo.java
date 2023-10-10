package com.hemanth.dsusingjava.doublylinkedlist;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.prepend(0);
        doublyLinkedList.displayForward(); // Output: 0 <-> 1 <-> 2 <-> 3 <-> null
        doublyLinkedList.displayBackward(); // Output: 3 <-> 2 <-> 1 <-> 0 <-> null
        doublyLinkedList.delete(2);
        doublyLinkedList.displayForward(); // Output: 0 <-> 1 <-> 3 <-> null

    }
}
