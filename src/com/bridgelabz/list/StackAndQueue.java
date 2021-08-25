package com.bridgelabz.list;

public class StackAndQueue {
    Node front,rear;

    public void enqueue(int x) {
        Node newNode=new Node(x);
        if(isEmpty()){
            rear = newNode;
            front = newNode;
        }
        else{
           rear.next = newNode;
           rear = newNode;
        }
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.printf("\nStack Underflow");
        }
        else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        StackAndQueue list=new StackAndQueue();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        System.out.println("The Elements of Queue are ");
        list.display();

    }
}