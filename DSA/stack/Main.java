package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(7);

        myStack.push(12);
        myStack.push(5);
        myStack.push(64);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

        System.out.println("\nPoped item: " + myStack.pop().value);
        System.out.println("Next poped item: " + myStack.pop().value);

        System.out.println("\nFinal Stack:");
        myStack.printStack();
    }
}
