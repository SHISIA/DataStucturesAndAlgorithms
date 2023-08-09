package stackDS;

public class Tester {
    public static void main(String[] args) {
        try {
            CustomStack<Integer> customStack = new CustomStack<>();
            customStack.add(2);
            customStack.add(5);
            customStack.add(6);
            customStack.push(9);
            System.out.println(customStack.pop());
            System.out.println(customStack.peek());

        }catch (StackException e) {
            throw new RuntimeException(e);
        }
    }
}
