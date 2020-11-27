package com.ankit.learningpoint.datastructure.graph;

public interface IGraph {
    void addEdge(Vertex v1, Vertex v2);
    void removeEdge(Vertex v1, Vertex v2);
    void addVertex(Vertex v);
    void printGraph();

}
