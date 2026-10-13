package com.packages.graphs;
import com.packages.arrays.*;
import com.packages.linked_list.*;

public class Graph 
{
    private final int T = 20;
    private Vertex recVertex[] = new Vertex[T];
    private int n;

    public Graph() {
        n = 0;
    }

    public int getT() {
        return T;
    }

    public Vertex[] getRecVertex() {
        return recVertex;
    }

    public void setRecVertex(Vertex[] recVertex) {
        this.recVertex = recVertex;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void addVertex(int datum) {
        recVertex[n] = new Vertex();
        recVertex[n].vertex = datum;
        recVertex[n].link = null;
        n++;
    }

    public void showVertex() {
        for (int i = 0; i < n; i++) {
            System.out.print(recVertex[i].vertex + " | ");
        }
    }
   

}
