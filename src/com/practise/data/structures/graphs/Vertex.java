package com.practise.data.structures.graphs;

import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endV, Integer weight){
        this.edges.add(new Edge(this, endV, weight));
    }

    public void removeEdge(Vertex endV){
        this.edges.removeIf(edge -> endV.equals(edge.getEndV()));
    }

    public void printVertex(boolean showWeight){
        StringBuilder message = new StringBuilder(" ");
        if(this.edges.isEmpty()){
            System.out.println(" " + this.data + "-->");
            return;
        }
        for (int i = 0; i < this.edges.size(); i++) {
            if(i == 0){
                message.append(this.edges.get(i).getStartV().data).append("-->");
            }
            message.append(this.edges.get(i).getEndV().data);
            if(showWeight){
                message.append("(").append(this.edges.get(i).getWeight()).append(")");
            }
            if (!(i == this.edges.size() -1)){
                message.append(",");
            }
            System.out.println(message);
        }
    }
}
