package linkedlist;

/**DoublyLinkedListt Data Structure
 * Time complexity : insertion O(1), deletion O(n),search O(n)**/
public class DoublyLinkedList {
    private int size;
    private Node tail;
    private Node head;

    //initialize the LinkedList with size zero (empty)
    public DoublyLinkedList(){
        this.size=0;
    }

    /**inserting the value at the first position requires updating the tail (if it is the first element in the linkedlist)
     * and the head :: the current node's next value is assigned (pointed to) the current head ,
     * the head pointer is reassigned to our current node,
     * the nodes previous pointer is null as there is no node on its left side
     * the head now has a node on its left side hence it has a prev , so we point its prev to the new node we are adding at 1st position
     * the head is then pointed to our current node
     * **/
    public void insertFirst(int val){
        Node node=new Node(val);
        if (size==0){
            head=node;
            head.prev=null;
            head.next=null;
            tail=head;
            size+=1;
            return;
        }
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;

        size+=1;
    }

    /** printing the values will require us to have a temp value that will keep on referring to
     * the next values as the Linked list is being traversed
     * ::NB: This method (display()) remains this way in a doubly linked list**/
    public void display(){
        Node temp=head;
        //since we do not know the length of the linkedlist, we have to use a while loop
        while(temp!=null){
            System.out.print(" "+temp.value+" -> next is ->");
            temp=temp.next;
        }
    }

    /** inserting last: check if the Linked list is empty, if so, insert it as the first element ,
     * else ,
     * point the current tail's next value to our new node and then make our new node the tail **/
    public void insertLast(int val){
        if (head==null){
            insertFirst(val);
//            return;
        }
        Node node=new Node(val);
        tail.next=node;
        //add the following line(s) to the singly linked list insertLast method
        node.prev=tail;
        node.next=null;
        //up to here
        tail=node;
        size++;
    }

    /** inserts the given value at the given index :: we first traverse to the element before
     * the mentioned index and then
     *use it as our pointer reference because it points to the index we want to change **/
    public void insert(int value,int index){
        if (index>size){
            throw new ArrayIndexOutOfBoundsException("index more than available space");
        }
        if (size<=1 || index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next,temp);
        temp.next.prev=node;
        temp.next=node;
        size++;
    }

    /**deleting the first value:: we check if the list is empty and return a -1 and stop, if the list has one
     * element we remove it by updating the tail and head to null, then we return its value, else we remove the head
     * by setting its pointer to the next element **/
    public int deleteFirst(){
        int value;
        if (size==0){
            return -1;
        }
        if (size==1){
            value=head.value;
            tail=null;
            head=null;
            return value;
        }
//        assert head != null;
        value=head.value;
        //add the following line(s) to the singly linked list deleteFirst() method code to make it a doubly linked  list
        head=head.next;
        head.prev=null;
        size--;
        return  value;
    }

    public Node find(int index){
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        return temp.next;
    }

    public int size(){
        return this.size;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        int value=tail.value;
        tail= find(size-2);
        tail.next=null;
        size--;
        return value;
    }

    private class Node{
        private int value;
        private Node next;

        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
