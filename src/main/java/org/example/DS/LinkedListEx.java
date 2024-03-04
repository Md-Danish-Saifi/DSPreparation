package org.example.DS;
class Node{
    int data;
    Node next;
}

public class LinkedListEx {


    static Node add(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    static void printList(Node node){
        while(node != null){
            System.out.print(node.data +" ");
            node = node.next;

        }
    }

    static Node mergeList(Node h1,Node h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        if(h1.data < h2.data){
            h1.next = mergeList(h1.next,h2);
            return h1;
        } else {
            h2.next = mergeList(h1,h2.next);
            return  h2;
        }
    }

    public static int deleteNode(Node head,int val){
        if(head == null){
            System.out.println("Element is not present in list");
            return -1;
        }
        if(head.data == val){
            if(head.next != null){
                head.data = head.next.data;
                head.next = head.next.next;
                return 1;
            } else {
                return 0;
            }
        }
        if(deleteNode(head.next,val)==0){
            head.next = null;
            return 1;
        }
        return -1;
    }

    public static int getLength(Node node){
        int len = 0;
        Node temp = node;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static void middleNode(Node node){
        if(node != null) {
            int length = getLength(node);
            Node temp = node;
            int middleLength = length/2;
            while (middleLength != 0){
                temp = temp.next;
                middleLength--;
            }
            System.out.println("middle element is "+temp.data);
        }
    }

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Create a dummy node to simplify the code
        Node dummy = add(0);
        dummy.next = head;
        Node current = dummy;

        while (current.next != null && current.next.next != null) {
            Node first = current.next;
            Node second = current.next.next;

            // Swapping nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = current.next.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        Node head1 = add(1);
        head1.next = add(3);
        head1.next.next = add(5);
        head1.next.next.next = add(7);

        Node head2 = new Node();
        head2.next = add(4);
        head2.next.next = add(6);
        head2.next.next.next = add(8);
        head2.next.next.next.next = add(10);
        head2.next.next.next.next.next= add(13);

//        printList(head1);
//        deleteNode(head1,9);
        printList(head2);
        System.out.println();

//        printList(mergeList(head1,head2));
//        middleNode(head2);
       printList(swapPairs(head2));
    }

}
