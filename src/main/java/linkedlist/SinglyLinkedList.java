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

    /**inserting the value at the first position requires updating the tail (if it is the first element in the linkedlist)
     * and the head :: the current node's next value is assigned (pointed to) the current head ,
     * the head pointer is reassigned to our current node, the head is then pointed to our current node**/
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }

    /** printing the values will require us to have a temp value that will keep on referring to
     * the next values as the Linkedlist is being traversed **/
    public void display(){
        Node temp=head;
        //since we do not know the length of the linkedlist, we have to use a while loop
        while(temp!=null){
            System.out.print(" "+temp.value+" -> next is ->");
            temp=temp.next;
        }
    }

    /** inserting last: check if the linkedlist is empty, if so, insert it as the first element and, else
     * point the current tail's next value to our new node and then make our new node the tail **/
    public void insertLast(int val){
        if (head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    /** inserts the given value at the given index :: we first traverse to the element before the mentioned index and then
     *use it as our pointer reference because it points to the index we want to change **/
    public void insert(int value,int index){
        if (head==null){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
        }
        Node temp=head;
        for (int i=1;i<index;i++){
           temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

//    public Node find(int val){
//        Node temp=head;
//        Node node=new Node(val);
//        while (temp!=null){
//            if (temp.next==node){
//                return temp;
//            }
//            temp=temp.next;
//        }
//        return
//    }



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
