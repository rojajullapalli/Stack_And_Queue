package com.bridgelabz.list;

public class StackAndQueue {
    Node top;

    public void push(int x) {
        Node newNode=new Node(x);
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.data = x;
            newNode.next = top;
            top = newNode;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.printf("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.print("\nStack Underflow");
            return;
        }
        for(int i=0;i<3;i++) {
            top = top.next;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }


    public static void main(String[] args) {
        StackAndQueue list=new StackAndQueue();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peek();//it will give top position of stack
        list.display();
        list.pop();
        System.out.println("\nafter deletion ");
        list.display();
        System.out.printf("\nTop element is %d\n", list.peek());
    }
}