package leetcodeLinkedListWithReadme.md;

import java.util.HashSet;
import java.util.Set;

public class NodeAtCycleBeginningLL {
    public Node detectCycle(Node head) {
        Set<Node> nodes = new HashSet<>();
        while(head!=null && head.next!=null){
            nodes.add(head);
            head=head.next;
            if(nodes.contains(head)){
                return head;
            }
        }
        return null;
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
