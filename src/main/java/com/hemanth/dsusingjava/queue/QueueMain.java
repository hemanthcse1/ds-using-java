package com.hemanth.dsusingjava.queue;

public class QueueMain {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        //arrayQueue.enqueue(8);

        arrayQueue.dequeue();
        arrayQueue.dequeue();

        System.out.println(arrayQueue.peek());


    }
}
