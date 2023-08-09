package stackDS;

public class Tester {
    public static void main(String[] args) {
        try {
            CustomStack<Integer> customStack = new CustomStack<>();
            customStack.add(2);
            customStack.add(5);
            customStack.add(6);
            System.out.println(customStack.search(5));
        }catch (StackException e) {
            throw new RuntimeException(e);
        }
    }
}
