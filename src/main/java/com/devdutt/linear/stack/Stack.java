package com.devdutt.linear.stack;

public class Stack {
    int arr[] = null;
    int capacity = 5;
    int top = -1;

    public Stack() {
        this.arr = new int[capacity];
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public boolean isFull() {
        return (top + 1) == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //Operation:01- Insertion
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full can't inserted");
            return;
        }
        //increment the top by 1
        top = top + 1;
        //store the data in arr[top]
        arr[top] = data;
        System.out.println(data + " is inserted in the stack");
    }

    //Operation:02- Deletion
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        //place the arr[top] element in the data
        int data = arr[top];
        //decrent the top by 1
        top = top - 1;
        System.out.println(data + " is removed from the stack");
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        System.out.println("stack size:- " + stack.size());
        stack.push(50);
        stack.push(10);
        stack.push(40);
        stack.push(70);
        System.out.println("stack size:- " + stack.size());
        System.out.println("Before Removing Element");
        System.out.println("Is Stack is Full:- " + stack.isFull());
        System.out.println("Is Stack is Empty:- " + stack.isEmpty());
        System.out.println(stack.peek() + " peek from the stack");
        System.out.println("======================");
        System.out.println("After Removing Element");
        stack.pop();
        System.out.println("stack size:- " + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("stack size:- " + stack.size());
        System.out.println("Is Stack is Full:- " + stack.isFull());
        System.out.println("Is Stack is Empty:- " + stack.isEmpty());
    }//main
}//class
