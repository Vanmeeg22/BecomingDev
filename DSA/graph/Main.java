package datastructures.graph;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        System.out.println("Created vertex:");
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.printGraph();

        System.out.println("\nCreated edge:");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        myGraph.printGraph();

        System.out.println("\nRemoving edge:");
        myGraph.removeEdge("A", "B");
        myGraph.printGraph();

        System.out.println("\nRemoving vertex \"D\":");
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}
