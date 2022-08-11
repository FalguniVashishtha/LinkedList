package com.bridgelabz;
import java.util.Scanner;
public class SortedList {
    Node head; //head of list
    void sortedInsert(Node new_node)
    {
        Node current;

        if (head == null || head.key >= new_node.key)
        {
            new_node.next = head;
            head = new_node;
        } else
        {
            //Locate the node before point of insertion.
            current = head;

            while (current.next != null && current.next.key < new_node.key)
                current = current.next;

            new_node.next = current.next;
            current.next = new_node;
        }
    }
    // Method to create a node
    Node newNode(int data)
    {
        Node x = new Node(data);
        return x;
    }
    // Method to print linked list
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
    }
    public static void sort()
    {
        Scanner sc = new Scanner(System.in);
        SortedList list = new SortedList();
        Node newNode; //check method newNode
        System.out.println("\nEnter the number of data to add inside list:");
        int n = sc.nextInt();
        System.out.printf("\nEnter %d elements to add inside list:",n).println();
        for (int i = 0; i<n; i++) {
            int new_Node = sc.nextInt();
            newNode = list.newNode(new_Node);
            list.sortedInsert(newNode);
        }
        System.out.println("\nCreated Linked List in an ascending order: ");
        list.printList();
    }

}
