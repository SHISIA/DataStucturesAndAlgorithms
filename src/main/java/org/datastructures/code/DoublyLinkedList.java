package org.datastructures.code;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> extends org.datastructures.code.LinkedList<E> {
    
    protected static class DoublyLinkedNode<E> extends Node<E>{
        protected DoublyLinkedNode<E> prev;
    }

    @Override
    protected Node<E> getNewNode(){
        return new DoublyLinkedNode<E>();
    }

//     Insertion at the beginning is very similar to that of a singly linked list, except that
// we must now update the next node's reference for its previous node. The node being
// inserted does not have a previous node in this case, so nothing needs to be done:
    @Override
    public Node<E> appendFirst(E value){
        Node<E> node = super.appendFirst(value);
        if(first.next !=null){
           ((DoublyLinkedNode<E>) first.next).prev = (DoublyLinkedNode<E>) first; 
        }
        return node;
    }

    //appending at the end
    @Override
    public Node<E> appendLast(E value){
        DoublyLinkedNode<E> origLast = (DoublyLinkedNode<E>) this.last;
        Node<E> node = super.appendLast(value);
        // If the original list were empty, the original last reference would be null:
        if(origLast == null){
            origLast = (DoublyLinkedNode<E>) first;
        }
        ((DoublyLinkedNode<E>)this.last).prev = origLast;
        return node;
    }

    // Insertion at an arbitrary location
    @Override
    public Node<E> insert(int index, E value){
        DoublyLinkedNode<E> inserted = (DoublyLinkedNode<E>) super.insert(index, value);
        if(length != 0 && index != length){
            if(inserted.next != null){
                inserted.prev =((DoublyLinkedNode<E>) inserted.next).prev;
                ((DoublyLinkedNode<E>)inserted.next).prev = inserted;
            }
        }
        return inserted;
    }

    // Removing the first element
    //Removing the first element is almost the same as that for a singly linked list. The
    // only additional step is to set the prev reference of the next node to null. The
    // following code does this:
    public Node<E> removeFirst(){
        super.removeFirst();
        if(first != null){
            ((DoublyLinkedNode<E>) first).prev = null;
        }
        return first;
    }

    // Removing an arbitrary element
    @Override
    public Node<E> removeAtIndex(int index){
        if(index < 0 || index >= length){
            throw new NoSuchElementException();
        }
        if(index == length -1){
            return removeLast();
        }
        DoublyLinkedNode<E> nodeRemoved=(DoublyLinkedNode<E>) super.removeAtIndex(index);
        if((DoublyLinkedNode<E>) nodeRemoved.next != null){
            ((DoublyLinkedNode<E>) nodeRemoved.next).prev = nodeRemoved.prev;
        }
        return nodeRemoved;
    }

    public Node<E> removeLast(){
        Node<E> origLast = last;
        if(last == null){
            throw new IllegalArgumentException("Removing element from an empty list");
        }
//         Just use the fact that we have access to the previous node's reference and we can
// update the last reference very easily:
        last = ((DoublyLinkedNode<E>) last).prev;
        //If the list is not empty after removal, set the next reference of the new last element to
        // null. If the new list is empty instead, update the first element as well:
        if(last!=null){
            last.next=null;
        }else{
            first = null;
        }
        length--;
        return origLast;
    }

    //Rotation
//     What we are doing here is just bringing the next element of the first element to the
// first position. This is exactly what the name "rotation" would imply:
    public void rotate(){
        last =first;
        first = first.next;
    }

}
