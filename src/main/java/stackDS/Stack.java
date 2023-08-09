package stackDS;

import java.util.concurrent.atomic.AtomicInteger;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Card> stack=new java.util.Stack<>();
        Card card1=new Card(1,"King");
        Card card2=new Card(2,"Queen");
        Card card3=new Card(3,"Joker");
        Card card4=new Card(4,"Slave");

        stack.add(card1);
        stack.add(card2);
        stack.add(card3);
        System.out.println(stack.push(card4).getName() + " pushed to the Top");
        System.out.println(stack.peek().getName()+ " is on the Top.");
        System.out.println(stack.pop().getName()+" popped from the Top!!");
        System.out.println("Is the Stack empty ? "+(stack.empty() ? "YES ":" NO "));
        AtomicInteger i= new AtomicInteger(0);
        stack.forEach(e -> System.out.println(i.incrementAndGet() +" " +e.getId()+" "+e.getName()));
        //empty our stack
        while (!stack.empty()){
            System.out.println(stack.peek().getName()+" element popped of ID "+stack.pop().getId());
        }
        //check if our element is empty
        System.out.println("Is the Stack empty ? "+(stack.empty() ? "YES ":" NO "));

    }
}
