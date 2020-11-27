package com.ankit.learningpoint.datastructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AdjacencyListGraphImpl implements IGraph{

    private Map<Vertex, LinkedList<Vertex>> adjList;

    public AdjacencyListGraphImpl() {
        adjList = new HashMap<>();
    }


    @Override
    public void addEdge(Vertex v1, Vertex v2) {
        if(!adjList.keySet().contains(v1)){
            addVertex(v1);
        }
        if(!adjList.keySet().contains(v2)){
            addVertex(v2);
        }
        adjList.get(v1).addFirst(v2);
    }

    @Override
    public void removeEdge(Vertex v1, Vertex v2) {
        adjList.get(v1).remove(v2);
    }

    @Override
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v, new LinkedList<>());
    }

    @Override
    public void printGraph() {
        adjList.entrySet().forEach((entrySet)->{
            System.out.println("vertex "+entrySet.getKey()+" is connected to "+entrySet.getValue());
        });
    }
}
