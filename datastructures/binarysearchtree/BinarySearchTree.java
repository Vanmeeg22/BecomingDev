package datastructures.binarysearchtree;

public class BinarySearchTree {
    Node root;

    //Inner class:
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    //Method to insert a value into the binary search tree:
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                else {
                    temp = temp.left;
                }
            }
            else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                else {
                    temp = temp.right;
                }
            }
        }
    }

    //Method to check if the binary search tree contains a specfic value:
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            }
            else if (value > temp.value) {
                temp = temp.right;
            }
            else {  // if (value == temp.value)
                return true;
            }
        }
        return false;
    }

    // Using recursion and callStack:
    // Recursive Contains() method:
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        }
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        }
        else {
            return rContains(currentNode.right, value);
        }
    }
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        }
        else if (value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode; // If value = currentNode
    }
    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
    }

    // To delete a node:
    // If the node to be deleted is the parent node that contains 2 branches on both left and right,
    // then we will take the smallest node from the right branch and replace it with the parent node
    // that we want to delete. After that, we will remove the second duplicate node present in the right branch.
    // Now, the node has been deleted by creating and replacing it with a duplicate of another node.

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }
    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
}
