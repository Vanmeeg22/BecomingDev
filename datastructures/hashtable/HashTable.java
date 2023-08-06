package datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;   //Creates an array space from index 0 to 7 to store the key-value pairs.
    private Node[] dataMap; //It will be an array.

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i=0; i<dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("  {" + temp.key + "= " + temp.value +"}");
                temp = temp.next;
            }
        }
    }

    //Hash method basically produces the index number where the key-value pair should be placed.
    //This hash method will only be used by other methods in this class and will not be called separately in the main method. That is why it is a private method.
    //Every index in the dataMap is a linked list on its own because the same index value can be assigned to more than one key string in the hash method.
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();    //Converts the string key into character array with indices for each letter.
        for (int i=0; i<keyChars.length; i++) {
            int asciiValue = keyChars[i];   //Refers to the ascii value or the number associated with the letter in the character array of the key.
            hash = (hash + asciiValue * 23) % dataMap.length;   //This equation will always give a random index number in each iteration within the size of the hash table or data length.
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);  //Produces the index for the key string passed.
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        }
        else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);  //Every index in hash table acts as a linked list on its own.
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            else {
                temp = temp.next;
            }
        }
        return 0;
    }

    //To take all the keys from the hash table and put them in an Array list and then return the array list.
    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i=0; i<dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
