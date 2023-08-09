package QueueDS;

import stackDS.Card;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Card> queue=new LinkedList<>();
        Card card1=new Card(1,"King");
        Card card2=new Card(2,"Queen");
        Card card3=new Card(3,"Joker");
        Card card4=new Card(4,"Slave");
        queue.add(card1);
        queue.add(card2);
        queue.add(card3);
        //offer method
        queue.offer(card4);
        //peek method
        System.out.println("Peek returns Card "+queue.peek().getName());
        //poll method
        System.out.println("Poll method returns Card "+queue.poll().getName());
        //remove method
        System.out.println("Remove operation removes Card "+queue.remove().getName());
        //print our present cards
        queue.forEach(e -> System.out.println(e.getName()));
        //check if queue is empty
        System.out.println("Is our Queue empty ? "+ (queue.isEmpty() ? "YES" : "NO"));

        //remove all elements
        while (!queue.isEmpty()){
            queue.remove();
        }

        //verify the queue is empty
        System.out.println("Is our Queue empty ? "+ (queue.isEmpty() ? "YES" : "NO"));
    }
}
