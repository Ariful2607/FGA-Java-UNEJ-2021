/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section303;
import java.util.*;
import static java.lang.System.exit;

/**
 *
 * @author Ay
 */
public class Lesson303 {
    public static void main(String[ ] args) {
        
        //HASH MAP 1
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Adi", 75);
//        map.put("Budi", 80);
//        map.put("Andi", 60);
// 
//        // Print size and content of the Map
//        System.out.println("Panjang Hash Map adalah : "
//                           + map.size());
// 
//        // Printing elements in object of Map
//        System.out.println(map);
// 
//        // Checking if a key is present and if
//        // present, print value by passing
//        // random element
//        if (map.containsKey("Andi")) {
// 
//            // Mapping
//            Integer a = map.get("Andi");
// 
//            // Printing value fr the corresponding key
//            System.out.println("Nilai ujian Andi adalah"
//                               + " \"Andi\" is: " + a);
//        }
        
        //HASH MAP 2
        
//        // No need to mention the
//        // Generic type twice
//        HashMap<Integer, String> hm1 = new HashMap<>();
// 
//        // Initialization of a HashMap using Generics
//        HashMap<Integer, String> hm2
//            = new HashMap<Integer, String>();
// 
//        // Adding elements using put method
//        // Custom input elements
//        hm1.put(1, "satu");
//        hm1.put(2, "dua");
//        hm1.put(3, "tiga");
// 
//        hm2.put(4, "empat");
//        hm2.put(5, "lima");
//        hm2.put(6, "enam");
// 
//        // Print and display mapping of HashMap 1
//        System.out.println("Mappings dari HashMap hm1 adalah : "
//                           + hm1);
// 
//        // Print and display mapping of HashMap 2
//        System.out.println("Mapping dari HashMap hm2 adalah : "
//                           + hm2);
        
//        // LINKED LIST
//        
//        // Creating object of the
//        // class linked list
//        LinkedList<String> ll
//            = new LinkedList<String>();
//  
//        // Adding elements to the linked list
//        ll.add("A");
//        ll.add("B");
//        ll.addLast("C");
//        ll.addFirst("D");
//        ll.add(2, "E");
//  
//        System.out.println(ll);
//  
//        ll.remove("B");
//        ll.remove(3);
//        ll.removeFirst();
//        ll.removeLast();
//  
//        System.out.println(ll);
        
//        // STACK USING LINKLIST
//        
//        // create Object of Implementing class
//        StackUsingLinkedlist obj = new StackUsingLinkedlist();
//        // insert Stack value
//        obj.push(11);
//        obj.push(22);
//        obj.push(33);
//        obj.push(44);
// 
//        // print Stack elements
//        obj.display();
// 
//        // print Top element of Stack
//        System.out.printf("\nTop element is %d\n", obj.peek());
// 
//        // Delete top element of Stack
//        obj.pop();
//        obj.pop();
// 
//        // print Stack elements
//        obj.display();
// 
//        // print Top element of Stack
//        System.out.printf("\nTop element is %d\n", obj.peek());
        
        // QUEUE USING LINKLIST
//        Queue q = new Queue();
//        q.enqueue(10);
//        q.enqueue(20);
//        q.dequeue();
//        q.dequeue();
//        q.enqueue(30);
//        q.enqueue(40);
//        q.enqueue(50);
//        q.dequeue();
//        System.out.println("Queue Depan : " + q.front.key);
//        System.out.println("Queue Belakang : " + q.rear.key);
    }
}
class StackUsingLinkedlist {
    // A linked list node
        private class Node {

        int data; // integer data
        Node link; // reference variable Node type
    }
    // create global top reference variable global
    Node top;

    // Constructor
    StackUsingLinkedlist() {
        this.top = null;
    }

        // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

            // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

        // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;

            }
        }
    }
}

// Java program for linked-list implementation of queue
 
// A linked list (LL) node to store a queue entry
class QNode {
    int key;
    QNode next;
 
    // constructor to create a new linked list node
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
 
// A class to represent a queue
// The queue, front stores the front node of LL and rear stores the
// last node of LL

class Queue {
    QNode front, rear;
 
    public Queue()
    {
        this.front = this.rear = null;
    }
 
    // Method to add an key to the queue.
    void enqueue(int key)
    {
 
        // Create a new LL node
        QNode temp = new QNode(key);
 
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
 
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
 
    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
 
        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }
}