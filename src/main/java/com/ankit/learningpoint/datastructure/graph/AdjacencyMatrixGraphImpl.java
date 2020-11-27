package com.ankit.learningpoint.datastructure.graph;

import java.util.Arrays;
import java.util.stream.Stream;

public class AdjacencyMatrixGraphImpl implements IGraph {

    private int vertexCount;

    private Integer adjMatrix [][];

    public AdjacencyMatrixGraphImpl(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new Integer[vertexCount][vertexCount];
        Stream.of(adjMatrix).forEach(row-> {
            Arrays.fill(row,0);
        });
    }

    @Override
    public void addEdge(Vertex v1, Vertex v2) {
        adjMatrix[v1.getIdentifier()][v2.getIdentifier()]=1;
    }

    @Override
    public void removeEdge(Vertex v1, Vertex v2) {
        adjMatrix[v1.getIdentifier()][v2.getIdentifier()]= 0;
    }

    /**
     * For simplicity Adding new vertex will remove all edges
     * @param v
     */
    @Override
    public void addVertex(Vertex v) {
        this.vertexCount++;
        adjMatrix = new Integer[vertexCount][vertexCount];
    }

    @Override
    public void printGraph() {
        Stream.of(adjMatrix).forEach((row) -> {
            Stream.of(row).forEach((val) -> System.out.print(val+ " "));
            System.out.println();
        });
    }

}
