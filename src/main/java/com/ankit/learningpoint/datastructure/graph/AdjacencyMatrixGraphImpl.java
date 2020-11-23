package com.ankit.learningpoint.datastructure.graph;

public class AdjacencyMatrixGraphImpl implements IGraph {

    private int vertexCount;

    private int adjMatrix [][];

    public AdjacencyMatrixGraphImpl(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new int[vertexCount][vertexCount];
    }

    @Override
    public void addEdge(int v1, int v2) {
        adjMatrix[v1][v2] = 1;
        //adjMatrix[v2][v1] = 1; // for undirected graph
    }

    @Override
    public void removeEdge(int v1, int v2) {
        adjMatrix[v1][v2] = 0;
        //adjMatrix[v2][v1] = 0; // for undirected graph
    }

    @Override
    public void printGraph() {
        System.out.println("AdjacencyMatrixGraphImpl");
        for (int[] row :adjMatrix) {
            for (int col: row) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }


    }
}
