package org.datastructures.code;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>, Visualizable{

    protected static class Node<E>{
        protected E value;
        protected Node next;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return value.toString();
        }
}
    int length=0;
    Node<E>[] lastModifiedNode;
    Node<E> first;
    Node<E> last;

    public Node<E> getNewNode(){
        Node<E> node=new Node<>();
        lastModifiedNode = new Node[]{node};
        return node;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    public Node<E> appendLast(E value){
        Node node=getNewNode();
        node.value = value;
        // We try to update the reference of the current last node only if the list is not empty:
        if(last != null){
            last.next = node;
//             Then, we must update the last reference as the new element is not going to be the
// last element:
            last=node;
        }
//         Finally, if the list is empty, the new element must also be the first new element and
// we must update the first reference accordingly:
        if(first==null){
            first=node;
        }
        length++;
        return node;
    
    }
    
}
