package com.practise.data.structures.graphs;

public class Edge {
    private Vertex startV;

    public Vertex getStartV() {
        return startV;
    }

    public void setStartV(Vertex startV) {
        this.startV = startV;
    }

    public Vertex getEndV() {
        return endV;
    }

    public void setEndV(Vertex endV) {
        this.endV = endV;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Vertex endV;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer weight) {
        this.startV = startV;
        this.endV = endV;
        this.weight = weight;
    }
}
