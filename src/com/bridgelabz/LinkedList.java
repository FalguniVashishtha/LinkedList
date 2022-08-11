package com.bridgelabz;

class Node
{
    public int key;
    public Node next;
    //constructor
    public Node(int data)
    {
        this.key = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        //taking object of operation class and passing the data
        Operations operations = new Operations();
        operations.add(70);
        operations.add(30);
        operations.add(56);
        //Calling the print method inside main method
        operations.print();
    }
}
//class for operations
class Operations {
    //declaration
    Node head, tail;
    //Created Method For adding Element in Linked List
    public void add(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = node;
            tail = node;
        } else
        {
            Node temp = head;
            this.head = node;
            node.next = temp;
        }
    }
    //print method
    public void print() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {
            Node temp = head;
            while (temp != null)
            {
                System.out.println(temp.key);
                temp = temp.next;
            }
        }
    }
}