package leetcodeLinkedListWithReadme.md;

public class GetMiddleOfLinkedList {

    public Node middleNode(Node head) {
        double size=0;
        Node dummyHead=head;
        //traverse the linkedlist while counting
        while(head!=null && head.next!=null){
            size++;
            head=head.next;
        }
        //divide the size into two to get middle node
        size /= 2;
        //make sure to round off the divides size to get the node i.e remove the decimals
        //then traverse to the middle node
        for(int i=0;i<Math.round(size);i++){
            dummyHead=dummyHead.next;
        }
        //return the middle node
        return dummyHead;
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
}
