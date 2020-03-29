package com.company;

import java.util.logging.Logger;

//to store node data and pointer to next node
class Node {
    String data;
    Node next = null;
    Node(String data) {
        this.data = data;
    }
    public String toString() {
        if (data == null)
            return "NULL";
        return data;
    }
}

// iterator class
class SListIterator {
    Node head;
    SListIterator(Node head) {
        this.head = head;
    }
    // returns data in a node
    public String data(Node temp) {
    	return temp.data;
    }
    //returns the next node
    public Node next() {
        head = head.next;
        return head;
    }
    //checks whether it has next node or not
    public boolean hasNext() {
        if(head.next != null)
            return true;
        return false;
    }
    //inserts node at last
    public void insertLast(String data) {
        if(head != null) { //if there is at least one node
            Node temp = head;
            while(temp.next != null) { // traverses to the last and appends the new node
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        else {
            head = new Node(data); //if there is no node then the new node itself becomes the head
        }

    }
    //deletes node at last
    public void deleteLast() {
        if(head != null) { // if there is at least one node
            Node prev = null;
            Node curr = head;
            while(curr.next != null) { // traverses to the last
                prev = curr;
                curr = curr.next;
            }
           prev.next = null; //deletes the last one
        }
    }
}

class List {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getAnonymousLogger();
        try {
            SList sList = new SList();
            SListIterator sListIterator1 = sList.iterator();
            sListIterator1.insertLast("1");
            sListIterator1.insertLast("2");
            sListIterator1.insertLast("3");
            sListIterator1.insertLast("4");
            sListIterator1.insertLast("5");
            sListIterator1.insertLast("6");
            sListIterator1.deleteLast();
            sListIterator1.deleteLast();
            LOGGER.info("list: "+ sList);
        }
        catch (Exception e) {
            LOGGER.info("Exception: " + e);
        }
    }
}


