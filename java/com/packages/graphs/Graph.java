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

    public void setInfo(int pos, int datum) {
        recVertex[pos].vertex = datum;
    }

    public Vertex getVertex(int pos) {
        return recVertex[pos];
    }

    public void setLink(int pos, NodeLDL dir) {
        recVertex[pos].linkRight = dir;
    }

    public void addVertex(int datum) {
        recVertex[n] = new Vertex();
        recVertex[n].vertex = datum;
        recVertex[n].linkRight = null;
        recVertex[n].linkLeft = null;
        n++;
    }

    public void showVertex() {
        for (int i = 0; i < n; i++) {
            System.out.print(recVertex[i].vertex + " | ");
        }
    }

    public int searchVertex(int datum) {
        int i = 0;
        int pos = -1; // Supuesto: dato no está
        while (pos == -1 && i < n) {
            if (recVertex[i].vertex == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    } 

}
