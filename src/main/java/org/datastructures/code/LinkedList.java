package org.datastructures.code;

import java.util.Iterator;
import java.util.NoSuchElementException;

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

//     Inserting an element at the beginning of a list is very similar to appending it at the
// end. The only difference is that you need to update the first reference instead of the
// last reference:
    public Node<E> appendFirst(E value){
        Node node = getNewNode();
        node.value = value;
        node.next=first;
        first=node;
        if(length==0){
            last=node;
        }
        length++;
        return node;

    }
    // Insertion at an arbitrary position
    // can be achieved in the same way we perform an
// insertion in the first element, except that we update the reference of the previous
// element instead of the first reference. There is, however, a catch; we need to find the
// position where we need to insert the element. There is no way to find it other than
// to start at the beginning and walk all the way to the correct position while counting
// each node we step on.
    public Node<E> insert(int index, E value){
        Node<E> node = getNewNode();

        if(index < 0 || index > length){
            throw new IllegalArgumentException("Invalid index for insertion");
        }else if(index == length){
            return appendLast(value);
        }else if(index == 0){
            return appendFirst(value);
        }else {
        //We walk all the way to the desired position while counting the
        // nodes, or in this case, counting the index in the opposite direction:
            Node<E> result =first;
            while(index > 1){
                index --;
                result = result.next;
            }
            // we update the references:
            node.value=value;
            node.next=result.next;
            result.next=node;
            length++;
            return node;
        }
    }

    public E findAtIndex(int index){
        //we start from the first element
        Node<E> result = first;
        while(index >=0)
        {
            if(result == null){
                throw new NoSuchElementException();
            }
            //When the index is 0, we would have finally reached the desired position, so
            // we return:
            else if(index == 0){
                return result.value;
            }else{
            // If we are not there yet, we must step onto the next element and keep counting:
                index --;
                result = result.next;
            }
        }
        return null;
    }

    //Reoving an element in the beginning means simply updating the reference to the first element
    //with that of the next element. NOTE: We do not update the reference in the element that has just been removed because the element along with the reference would be garbage-colected anyway
      public Node<E> removeFirst(){
        if(length == 0){
            throw new NoSuchElementException();
        }
        //assign reference to the next element
        Node<E> origFirst = first;
        first=first.next;
        length --;
        // If there are no more elements left, we must also update the last reference:
        if(length == 0){
            last = null;
        }
        return origFirst;
      }

    //   Removing an arbitrary element
    
    
}
