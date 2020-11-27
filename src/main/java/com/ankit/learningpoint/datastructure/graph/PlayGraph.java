package com.ankit.learningpoint.datastructure.graph;

public class PlayGraph {
    public static void main(String[] args) {
        IGraph graph = new AdjacencyListGraphImpl();
        Vertex<String> a = new Vertex("a");
        Vertex<String> b = new Vertex("b");
        Vertex<String> c = new Vertex("c");
        Vertex<String> d = new Vertex("d");

        graph.addEdge(a,b);
        graph.addEdge(a,c);
        graph.addEdge(a,d);

        graph.addEdge(b,c);
        graph.addEdge(b,d);

        graph.addEdge(c,d);

        graph.addEdge(d,a);

        graph.printGraph();


    }
}
