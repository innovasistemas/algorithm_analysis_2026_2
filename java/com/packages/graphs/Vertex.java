package com.packages.graphs;
import com.packages.linked_list.*;

public class Vertex 
{
    // Información del nodo (vértice)
    public int vertex;

    // Puntero a cada LDL de adyacencia
    public LinkedDoubleList adyacencyList; 

    // Campos para el control exclusivo de algoritmos de caminos
    public boolean visited; // Evita ciclos infinitos
    public int predecessor; // Guarda el índice de quien lo descubrió para construir el camino
}
