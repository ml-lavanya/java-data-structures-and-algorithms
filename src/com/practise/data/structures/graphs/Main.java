package com.practise.data.structures.graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(true, true);
        Vertex mike = graph.addVertex("mike");
        Vertex steve = graph.addVertex("steve");
        Vertex luffy = graph.addVertex("luffy");
        graph.addEdge(mike, steve, 5);
        graph.addEdge(mike, luffy, 10);
        graph.printVertex(mike);
        graph.removeEdge(mike, luffy);
        System.out.println("\n After removing luffy node");
        graph.printVertex(mike);
        System.out.println("\n display all graph vertices");
        graph.addEdge(mike, luffy, 10);
        graph.printVertices();
    }
}
