package edu.neu.csye6200;

public class Driver {

    public static void demo() {
        System.out.println("=== IntQueue Demo ===");
        IntQueue intQueue = new IntQueue(3);
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.display();
        System.out.println("Dequeued: " + intQueue.dequeue());
        intQueue.display();

        System.out.println("\n=== GenericQueue Demo ===");
        GenericQueue<String> gq = new GenericQueue<>(3);
        gq.enqueue("A");
        gq.enqueue("B");
        gq.enqueue("C");
        gq.display();
        System.out.println("Dequeued: " + gq.dequeue());
        gq.display();

        System.out.println("\n=== IntStack Demo ===");
        IntStack intStack = new IntStack(2);
        intStack.push(5);
        intStack.push(15);
        intStack.display();
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        System.out.println("\n=== GenericStack Demo ===");
        GenericStack<String> gs = new GenericStack<>(2);
        gs.push("X");
        gs.push("Y");
        gs.display();
        System.out.println("Popped: " + gs.pop());
        gs.display();

        System.out.println("\n=== LinkedList FIFO Demo ===");
        LinkedListDemo.demoLinkedListFIFO();

        System.out.println("\n=== LinkedList LIFO Demo ===");
        LinkedListDemo.demoLinkedListLIFO();
    }

    public static void main(String[] args) {
        demo(); // Only calls demo, no user input
    }
}
