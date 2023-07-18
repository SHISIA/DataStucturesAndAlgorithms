package linkedlist;

import org.datastructures.code.Bro_Code.Node;

public class TestClass {
    public static void main(String[] args) {
        SinglyLinkedList linkedList=new SinglyLinkedList();
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(5);
//        linkedList.insertFirst(11);
//        linkedList.insertFirst(70);
//        System.out.println(linkedList.size());
//        linkedList.insert(50,4);
//        linkedList.insertLast(500);
//        linkedList.display();
//        System.out.println("\nCurrent size "+linkedList.size());
//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deleteFirst());
//
//        System.out.println("\nNew size "+linkedList.size());
//        linkedList.display();

        linkedList.head=new SinglyLinkedList.Node(9);
        linkedList.head.next=new SinglyLinkedList.Node(10);
        linkedList.head.next.next=new SinglyLinkedList.Node(11);
        linkedList.head.next.next.next=new SinglyLinkedList.Node(12);
        linkedList.head.next.next.next.next=new SinglyLinkedList.Node(13);
        linkedList.display();
        linkedList.reversed();
        System.out.println();
        linkedList.display();


    }
}
