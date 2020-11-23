package com.ankit.learningpoint.datastructure.graph;

public class PlayGraph {
    public static void main(String[] args) {
        IGraph graph = new AdjacencyMatrixGraphImpl(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);

        graph.addEdge(1,2);
        graph.addEdge(1,3);

        graph.addEdge(2,3);
        graph.addEdge(2,1);

        graph.addEdge(3,1);
        graph.addEdge(3,2);

        graph.printGraph();

        graph = new AdjacencyListGraphImpl(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);

        graph.addEdge(1,2);
        graph.addEdge(1,3);

        graph.addEdge(2,3);
        graph.addEdge(2,1);

        graph.addEdge(3,1);
        graph.addEdge(3,2);

        graph.printGraph();

    }
}
