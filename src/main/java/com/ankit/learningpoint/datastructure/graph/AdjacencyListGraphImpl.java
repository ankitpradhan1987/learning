package com.ankit.learningpoint.datastructure.graph;

import java.util.LinkedList;

public class AdjacencyListGraphImpl implements IGraph{

    private int vertexCount;

    private LinkedList<Integer>[] adjList;

    public AdjacencyListGraphImpl(int vertexCount) {
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0 ; i< adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        adjList[v1].addFirst(v2);
        //adjList[v2].addFirst(v1); // for
    }

    @Override
    public void removeEdge(int v1, int v2) {
        adjList[v1].remove(v2);
    }

    @Override
    public void printGraph() {
        System.out.println("AdjacencyListGraphImpl");
        for (int i =0 ; i< adjList.length; i++) {
            System.out.println(i+ " is connected to "+adjList[i]);
        }
    }
}
