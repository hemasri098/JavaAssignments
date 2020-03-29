package com.company;

class SList {
    Node head=new Node(null);
    SListIterator iterator() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head !=null) {   // if the list is not empty
            SListIterator iterator = this.iterator();
            StringBuffer listOfNodes = new StringBuffer();
            while (iterator.hasNext()) {
                listOfNodes.append(iterator.data(iterator.next()) + "->"); //appending all the nodes to the listOfNodes
            }
            return listOfNodes.substring(0, listOfNodes.length() - 2) + "\n";
        }
        else {
            return "It is an empty list"; //returns if it is an empty list
        }
    }
}
