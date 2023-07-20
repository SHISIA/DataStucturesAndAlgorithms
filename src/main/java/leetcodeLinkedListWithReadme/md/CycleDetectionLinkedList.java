package leetcodeLinkedListWithReadme.md;

public class CycleDetectionLinkedList {
    public int size;
    public Node tail;
    public Node head;

    //initialize the LinkedList with size zero (empty)
    public CycleDetectionLinkedList(){
        this.size=0;
    }

    public void deleteDuplicates(){
        Node node = head;
        //if the node is null return the node as we have no more elements to traverse
        if (head==null){
            return;
            //return node where a return type is needed;
        }
        //loop through from head to tail by invoking the head.next
        //make sure to first check if head.next==null
        while (head.next!=null){
            //if the current and next value are same, skip the next value by assigning the current node's
            // next to the next values next node
            // and reduce the size
            if (head.value==head.next.value){
                head.next=head.next.next;
                size --;
            }
            //else move to the next value
            else {
                head=head.next;
            }
        }
        head=node;

        //if in a leetcode test where you have to return a node value, return the head commented above
        //as it point to our first node
//        return node;
    }

    /**
     * Reverse the linkedlist
     **/
    public void reversed(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head=prev;
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

    /**deleting the first value:: we check if the list is empty and return a -1 and stop, if the list has one
     * element we remove it by updating the tail and head to null, then we return its value, else we remove the head
     * by setting tis pointer to the next element **/
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
        assert head != null;
        value=head.value;
        head=head.next;
        size--;
        return  value;
    }

    public Node find(int index){
        Node temp=head;
        Node node;
        for (int i = 1; i < index-1; i++) {
            temp=temp.next;
        }
        node=temp;
        return node;
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

    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public boolean hasCycle(Node head) {
        //node fast is the fast pointer
        Node fast=head;
        //node slow is the slow pointer
        Node slow=head;
        //method used: Slow and Fast pointer
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }


        }
        return false;
    }
}
