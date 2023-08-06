package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();    //It will create an empty binary search tree.

        System.out.println("Root = " + myBST.root);

        myBST.insert(43);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(102);
        myBST.insert(11);
        myBST.insert(15);

        System.out.println("\nRoot = " + myBST.root.value);
        System.out.println("\nLeft of Root = " + myBST.root.left.value);
        System.out.println("Right of Root = " + myBST.root.right.value);

        System.out.println("\nContains 11? " + myBST.contains(11));
        System.out.println("\nContains 8? " + myBST.contains(8));

        System.out.println("\nBST contains 102:");
        System.out.println(myBST.rContains(102));

        System.out.println("\nBST contains 17:");
        System.out.println(myBST.rContains(17));

        System.out.println("\nNew BST:");
        BinarySearchTree myBST2 = new BinarySearchTree();
        myBST2.rInsert(2);
        myBST2.rInsert(1);
        myBST2.rInsert(3);

        System.out.println("\nRoot = " + myBST2.root.value);
        System.out.println("Root -> Left = " + myBST2.root.left.value);
        System.out.println("Root -> Right = " + myBST2.root.right.value);

        System.out.println("To find the min value:");
        System.out.println(myBST.minValue(myBST.root));
        System.out.println(myBST.minValue(myBST.root.right));

        myBST.deleteNode(102);
    }
}
