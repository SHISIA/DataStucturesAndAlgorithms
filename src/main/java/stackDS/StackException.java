package stackDS;

public class StackException extends Exception {
    public StackException(String cannotAddElement) {
        System.out.println(cannotAddElement);
    }
}
