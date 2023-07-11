package linkedlist;

import org.datastructures.code.Bro_Code.Node;

public class TestClass {
    public static void main(String[] args) {
        DoublyLinkedList linkedList=new DoublyLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(5);
        linkedList.insertFirst(11);
        linkedList.insertFirst(70);
        System.out.println(linkedList.size());
        linkedList.insert(50,4);
        linkedList.insertLast(500);
        linkedList.display();
        System.out.println("\nCurrent size "+linkedList.size());
        System.out.println(linkedList.deleteLast());
        System.out.println(linkedList.deleteFirst());

        System.out.println("\nNew size "+linkedList.size());

        linkedList.display();
    }
}
