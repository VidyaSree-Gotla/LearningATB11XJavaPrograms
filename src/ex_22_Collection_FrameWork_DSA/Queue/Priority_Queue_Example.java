package ex_22_Collection_FrameWork_DSA.Queue;

import java.util.PriorityQueue;

public class Priority_Queue_Example {
    //A queue interface in Java is a data structure that follows the First-In-First-Out (FIFO) principle,
    // where the first element added to the queue is the first one to be removed.
    // It operates like a real-world queue, such as a waiting line, where items are processed in the order they arrive.
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        q.add("Hello");
        q.add("Ajay");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek()); //The peek operation allows you to view the element at the front of the queue without removing it. It returns the value of the next element that would be dequeued but leaves the queue unchanged.
        System.out.println(q);
        System.out.println(q.poll()); //The poll operation, on the other hand, retrieves and removes the element at the front of the queue. It returns the value of the dequeued element and simultaneously removes it from the queue.
        System.out.println(q);

    }
}
