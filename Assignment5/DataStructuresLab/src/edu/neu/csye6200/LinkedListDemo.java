package edu.neu.csye6200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedListDemo {

    // 10 POINTS: FIFO using LinkedList
    public static void demoLinkedListFIFO() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alpha");
        queue.add("Beta");
        queue.add("Gamma");

        System.out.println("Queue (FIFO): " + queue); // Output: [Alpha, Beta, Gamma]
        System.out.println("Dequeued: " + queue.poll()); // Output: Alpha
        System.out.println("Queue After Dequeue: " + queue); // Output: [Beta, Gamma]
    }

    // 10 POINTS: LIFO using Stack (LinkedList internally)
    public static void demoLinkedListLIFO() {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack (LIFO): " + stack); // Output: [One, Two, Three]
        System.out.println("Popped: " + stack.pop()); // Output: Three
        System.out.println("Stack After Pop: " + stack); // Output: [One, Two]
    }
}
