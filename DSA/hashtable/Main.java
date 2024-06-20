package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("Vanmeeg", 44);
        myHashTable.set("Sidharth", 170);
        myHashTable.set("Dorothy", 183);
        myHashTable.set("nails", 230);
        myHashTable.set("bolts", 143);
        myHashTable.set("screws", 98);
        myHashTable.set("tile", 15);
        myHashTable.set("lumber", 122);

        myHashTable.printTable();

        System.out.println("\nUsing the get() method:");
        System.out.println("\nValue of Tile = " + myHashTable.get("tile"));
        System.out.println("Value of Vanmeeg = " + myHashTable.get("Vanmeeg"));
        System.out.println("Value of Sid = " + myHashTable.get("Sid"));
        System.out.println("Value of Dorothy = " + myHashTable.get("Dorothy"));

        System.out.println("\nPrinting all the keys in an array list format:\n" + myHashTable.keys());
    }
}
