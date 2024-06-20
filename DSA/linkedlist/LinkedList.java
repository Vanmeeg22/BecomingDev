package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    //Inner class:
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    //Constructor to create a linked list node:
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Method to print the created linked list:
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //Other methods:
    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    //Method for appending a node at the end:
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        //If length > 0:
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Method to remove the last node:
    public Node removeLast(){
        if (length == 0)
            return null;

        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;   //Will move the temp variable to the next node in the list.
        }
        //When temp.next = null, it will jump out of the loop to execute the following:
        tail = pre;
        tail.next = null;
        length--;
        //To remove the node pointing to head and tail:
        //This should be performed after running the while loop:
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Method to prepend:
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        //If length > 0:
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Method to remove the first node:
    public Node removeFirst(){
        if (length == 0)
            return null;

        Node temp = head;

        head = head.next;
        temp.next = null;
        length--;

        if (length == 0){
            tail = null;
        }
        return temp;
    }

    //Method to get an item from the list:
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Method to change the value of an item using its index value:
    public boolean set(int index, int value){
        Node temp = get(index); //Will directly set the temp variable to the node that we want to change.
        if (temp != null){
            temp.value = value;
            return true;
        }
        else
            return false;
    }

    //Method to insert a node in the linked list:
    public boolean insert(int index, int value){
        if (index < 0 || index > length)
            return false;
        if (index == 0){
            prepend(value); //Code already exists in the prepend() method for inserting in the beginning.
            return true;
        }
        if (index == length){
            append(value);  //Code already exists in the append() method for inserting at the end.
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //Method to remove a node:
    public Node remove(int index){
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();   //Code for removing the first element already exists in removeFirst() method.
        if (index == length - 1)
            return removeLast();    //Code for removing the last element already exists in removeLast() method.

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    //Method to reverse the entire linked list:
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
