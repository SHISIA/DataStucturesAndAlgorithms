package org.datastructures.code;

/*
 * A circular linked list is an ordinary linked list, except that the last element holds the
reference to the first element as its next element. This, of course, justifies its name. It
would be useful when, for example, you are holding a list of players in a list and they
play in turn in a round robin fashion. The implementation is simplified if you use a
circular linked list and just keep rotating as the players complete their turn:
 */
public class CircularLinkedList<E> extends LinkedList<E> {
    
// Insertion
// This is the same as the insertion for a simple linked list, except that you assign the
// last references next to the first:
    @Override
    public Node<E> appendFirst(E value){
        Node<E> newNode = super.appendFirst(value);
        last.next = first;
        return newNode;
    }
    // From this, it is not hard to guess how it would be to append at the end:
    @Override
    public Node<E> appendLast(E value){
        Node<E> newNode = super.appendLast(value);
        last.next = first;
        return newNode;
    }

    //Removal
//     Removal also only changes when you remove the first or the last element. In any
// case, just updating the last element's next reference solves the purpose. The only
// place where we need to change this is when we remove the first element. This is
// because the same operation we used for a simple linked list does not update the
// previous element's next reference, which we need to do:
    @Override
    public Node<E> removeFirst(){
        Node<E> newNode = super.removeFirst();
        last.next = first;
        return newNode;
    }
}
