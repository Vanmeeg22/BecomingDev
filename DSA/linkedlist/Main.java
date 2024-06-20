package datastructures.linkedlist;

public class Main {
    public static void main(String[] args){
        System.out.println("Creating a Linked list:");
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.printList();

        System.out.println("\nAfter appending:");
        myLinkedList.append(9);
        myLinkedList.printList();

        System.out.println("\nRemoved item: " + myLinkedList.removeLast().value);
        System.out.println("After removing last node:");
        myLinkedList.printList();

        System.out.println("\nAfter prepending:");
        myLinkedList.prepend(13);
        myLinkedList.printList();

        System.out.println("\nRemoved item: " + myLinkedList.removeFirst().value);
        System.out.println("After removing first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved item: " + myLinkedList.removeFirst().value);
        System.out.println("After removing first node again:");
        myLinkedList.printList();

        System.out.println("\nRemoved item: " + myLinkedList.removeFirst());
        System.out.println("After removing first node again:");
        myLinkedList.printList();

        System.out.println("\nAfter appending:");
        myLinkedList.append(7);
        myLinkedList.append(54);
        myLinkedList.append(12);
        myLinkedList.printList();

        System.out.println("\nFinal Linked List:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("List:");
        myLinkedList.printList();

        System.out.println("\nValue in index 1: " + myLinkedList.get(1).value);
        System.out.println("Value in index 2: " + myLinkedList.get(2).value);

        System.out.println("\nChanging the value of index 1:");
        myLinkedList.set(1,102);
        myLinkedList.printList();

        System.out.println("\nInserting an item in index 1:");
        myLinkedList.insert(1, 566);
        myLinkedList.printList();

        System.out.println("\nRemoving the item in index 2:");
        myLinkedList.remove(2);
        myLinkedList.printList();

        System.out.println("\nReversing the linked list:");
        myLinkedList.reverse();
        myLinkedList.printList();

        System.out.println("\nFinal Linked List:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }
}
