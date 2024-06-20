package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.append(21);
        myDLL.append(19);

        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());

        myDLL.prepend(65);
        myDLL.prepend(17);
        myDLL.prepend(42);

        System.out.println("\nList:");
        myDLL.printList();
        System.out.println("\nRemoved first item: " + myDLL.removeFirst().value);

        System.out.println("\nList:");
        myDLL.printList();

        System.out.println("\nGet: " + myDLL.get(1).value);

        System.out.println(myDLL.set(0, 12));
        myDLL.printList();

        System.out.println(myDLL.insert(0, 56));
        myDLL.printList();

        System.out.println(myDLL.remove(0).value);
        myDLL.printList();

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        myDLL.printList();
    }
}
