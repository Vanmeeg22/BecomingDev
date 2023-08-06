package datastructures.Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.enqueue(64);
        myQueue.enqueue(11);
        myQueue.enqueue(52);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();

        System.out.println("\nDequeued item: " + myQueue.dequeue().value);
        System.out.println("Dequeued item: " + myQueue.dequeue().value);

        System.out.println("\nFinal Queue:");
        myQueue.printQueue();
    }
}
