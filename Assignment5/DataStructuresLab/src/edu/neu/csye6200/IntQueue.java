package edu.neu.csye6200;

public class IntQueue {
    private int[] data;
    private int front, rear, size;

    public IntQueue(int capacity) {
        data = new int[capacity];
        front = size = 0;
        rear = -1;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) throw new RuntimeException("Queue is full.");
        rear = (rear + 1) % data.length;
        data[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty.");
        int item = data[front];
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int count = size, i = front;
        while (count-- > 0) {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
        }
        System.out.println();
    }
}
