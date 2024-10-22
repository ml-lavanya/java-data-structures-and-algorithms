package com.practise.data.structures.graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;

    public boolean isWeighted() {
        return isWeighted;
    }

    public void setWeighted(boolean weighted) {
        isWeighted = weighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean directed) {
        isDirected = directed;
    }

    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex start, Vertex end, Integer weight){
        if(!this.isWeighted){
            weight = null;
        }
        start.addEdge(end, weight);
    }

    public void printVertex(Vertex vertex){
        vertex.printVertex(isWeighted());
    }

    public void removeEdge(Vertex start, Vertex end){
        start.removeEdge(end);
    }

    public void printVertices(){
        for (Vertex currentVertex : vertices) {
            currentVertex.printVertex(isWeighted());
        }
    }
}
