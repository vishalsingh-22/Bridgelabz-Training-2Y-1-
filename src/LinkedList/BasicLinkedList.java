package LinkedList;

import java.sql.SQLOutput;

public class BasicLinkedList {

    // by using method ( Method 4 )
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }

    public static  void recursive(Node head){
        if(head==null){

        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        // connect node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // Method 1
        System.out.print(a.data+"->");
        System.out.print(b.data+"->");
        System.out.print(c.data+"->");
        System.out.print(d.data+"->");
        System.out.print(e.data+"->");
        System.out.println(e.next);


        // Method 2
        System.out.print(a.data+"->");
        System.out.print(a.next.data+"->");
        System.out.print(a.next.next.data+"->");
        System.out.print(a.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.data+"->");
        System.out.println(a.next.next.next.next.next);


        // by using for loop
        Node temp = a;
        for(int i=0; i<5; i++){
            System.out.print(temp.data+"->");
            temp = temp.next;

        }

        System.out.println();

        // by using while loop
        Node temp1 = a;
        while(temp1!=null){
            System.out.print(temp1.data+"->");
            temp1 = temp1.next;
        }
        // by using Method 4
        System.out.println();
        display(a);

        // by recursion
        System.out.println();
        recursive(a);
    }
}
