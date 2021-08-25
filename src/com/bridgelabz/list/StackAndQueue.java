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
        if (top == null) {
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


    public static void main(String[] args) {
        StackAndQueue list=new StackAndQueue();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println("The Stack elements are ");
        list.display();
    }
}