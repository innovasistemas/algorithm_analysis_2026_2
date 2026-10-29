package com.packages.graphs;
import com.packages.linked_list.*;

public class Graph 
{
    private final int T = 20;
    private Vertex arrayVertex[] = new Vertex[T];
    private int n;

    public Graph() {
        n = 0;
    }

    public int getT() {
        return T;
    }

    public Vertex[] getArrayVertex() {
        return arrayVertex;
    }

    public void setArrayVertex(Vertex[] arrayVertex) {
        this.arrayVertex = arrayVertex;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setInfo(int pos, int datum) {
        arrayVertex[pos].vertex = datum;
    }

    public void setLink(int pos, LinkedDoubleList list) {
        arrayVertex[pos].adyacencyList = list;
    }

    public Vertex getVertex(int pos) {
        return arrayVertex[pos];
    }

    public void resetSearchField() {
        for (int i = 0; i < n; i++) {
            arrayVertex[i].visited = false;
            arrayVertex[i].predecessor = -1;
        }
    }

    public void addVertex(int datum) {
        arrayVertex[n] = new Vertex();
        arrayVertex[n].vertex = datum;
        arrayVertex[n].adyacencyList = null; // Nodo sin lista de adyacencia

        // Inicialización para los algoritmos de caminos
        arrayVertex[n].visited = false; // Ningún nodo inicia visitado
        arrayVertex[n].predecessor = -1; // Sin antecesor aún
        n++;
    }

    public void showVertex() {
        System.out.println("Nodos del grafo");
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(" | " + arrayVertex[i].vertex);
        }
        System.out.print(" | ");
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print("-----");
        }
    }
    
    public void showGraph() {
        System.out.println("Grafo completo");
        for (int i = 0; i < n; i++) {
            System.out.println("  -----");
            System.out.print(" | " + arrayVertex[i].vertex + " |---> ");
            if (arrayVertex[i].adyacencyList != null) {
                arrayVertex[i].adyacencyList.showLDL();
            } else {
                System.out.print(" ---|||");
            }
            System.out.print("\n");
            System.out.println("  -----");
        } 
    }

    public int searchVertex(int datum) {
        int i = 0;
        while (i < n && arrayVertex[i].vertex != datum) {
            i++;
        }
        return i;
    } 

    public boolean adyacencyNode(int pos, int datum) {
        return arrayVertex[pos].adyacencyList.searchNodeLDL(datum) != null;
    }

    public int countEdges() {
        int totalEdges = 0;
        for (int i = 0; i < n; i++) {
            if (arrayVertex[i].adyacencyList != null) {
                totalEdges += arrayVertex[i].adyacencyList.n;
            }
        }
        return totalEdges;
    }

}
