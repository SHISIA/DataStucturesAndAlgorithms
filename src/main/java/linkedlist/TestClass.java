package linkedlist;

import org.datastructures.code.Bro_Code.Node;

public class TestClass {
    public static void main(String[] args) {
        SinglyLinkedList linkedList=new SinglyLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(0);
        linkedList.insertFirst(5);
        linkedList.insert(50,2);
        linkedList.deleteLast();

        System.out.println(linkedList.deleteFirst());
        linkedList.display();
    }
}
