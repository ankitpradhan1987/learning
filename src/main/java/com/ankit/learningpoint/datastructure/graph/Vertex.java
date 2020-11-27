package com.ankit.learningpoint.datastructure.graph;

import java.util.Objects;

public class Vertex<T> {


    private static int identifierCounter=0;

    //this variable should not be exposed to exterior world.
    private final Integer identifier;
    private T data;

    public Vertex(T data) {
        this.data = data;
        identifier = identifierCounter++;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(identifier, vertex.identifier) &&
                Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, data);
    }
}
