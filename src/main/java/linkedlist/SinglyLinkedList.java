package linkedlist;

/**Singly Ln=inkedList Data Structure**/
public class SinglyLinkedList {
    private int size;
    private Node tail;
    private Node head;

    //initialize the LinkedList with size zero (empty)
    public SinglyLinkedList(){
        this.size=0;
    }

   private class Node{
       private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
       public Node(int value,Node next){
            this.value=value;
            this.next=next;
       }
    }
}
