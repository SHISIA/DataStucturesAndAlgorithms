package stackDS;

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
        queue.add(card4);
        //check our present cards
        queue.forEach(e -> System.out.println(e.getName()));
    }
}
