package org.example.DS;

class Nodes {
     int data;
     Nodes next;
    public Nodes (int data){
        this.data = data;
        next = null;
    }
}
public class LinkedList {
    Nodes head = null;
    public void add(int data){
        Nodes newNode = new Nodes(data);
        Nodes current = head;
        if(head == null){
            head = newNode;
        } else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addFirst(int data){
        Nodes node = new Nodes(data);
        node.next = head;
        head = node;
    }
    public Nodes addAt(int data,int index){

        if (index < 1)
            System.out.print("Invalid position");
        if (index == 1) {
            Nodes newNode = new Nodes(data);
            newNode.next = head;
            head = newNode;
        } else {
            for(int i=1;i<index - 1;i++)
            {
                head=head.next;
            }
            Nodes newNode= new Nodes(data);
            newNode.next=head.next;
            head.next=newNode;
        }
        return head;
    }
    public Nodes swapPairs() {
        // Create a dummy node to simplify the code
        Nodes dummy = new Nodes(0);
        dummy.next = head;
        Nodes current = dummy;

        while (current.next != null && current.next.next != null) {
            Nodes first = current.next;
            Nodes second = current.next.next;

            // Swapping nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = current.next.next;
        }

        return dummy.next;
    }
    public void printList() {
       Nodes current = head;
       while(current != null){
           System.out.print(current.data+" ");
           current = current.next;
       }
    }
}
