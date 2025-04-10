package edu.neu.csye6200;

public class IntStack {
    private int[] data;
    private int top;

    public IntStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (isFull()) throw new RuntimeException("Stack is full.");
        data[++top] = item;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty.");
        return data[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
