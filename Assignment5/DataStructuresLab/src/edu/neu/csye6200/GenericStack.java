package edu.neu.csye6200;

public class GenericStack<T> {
    private Object[] data;
    private int top;

    public GenericStack(int capacity) {
        data = new Object[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T item) {
        if (isFull()) throw new RuntimeException("Stack is full.");
        data[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty.");
        return (T) data[top--];
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
