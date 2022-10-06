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

    //Operation:01- Insertion
    public void push(int data) {
        if (top + 1 == capacity) {
            System.out.println("Stack is full can't inserted");
            return;
        }
        //increment the top by 1
        top = top + 1;
        //store the data in arr[top]
        arr[top] = data;
        System.out.println(data + " is inserted in the stack");
    }

    //delete the element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        //place the arr[top] element in the data
        int data = arr[top];
        //decrement the top by 1
        top = top - 1;
        System.out.println(data + " is removed from the stack");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.push(10);
        stack.push(40);
        stack.push(70);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }//main
}//class
