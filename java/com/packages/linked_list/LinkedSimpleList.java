package com.packages.linked_list;

public class LinkedSimpleList 
{
    public NodeLSL head;
    public int n;

    public LinkedSimpleList()
    {
        head = null;
        n = 0;
    }

    public void addNodeLSLBegin(int datum)
    {
        NodeLSL p = new NodeLSL();
        p.info = datum;
        p.link = head;
        head = p;
        n++;
    }

    public void showLSL()
    {
        NodeLSL p = head;
        System.out.println("Total nodos: " + n);
        while (p != null) {
            System.out.println("======================");
            System.out.println("Información: " + p.info);
            System.out.println("Liga de p: " + p.link);
            System.out.println("Dirección de p: " + p);
            p = p.link;
        }
    }

    public NodeLSL searchNodeLSL(int datum)
    {
        NodeLSL p = head;
        NodeLSL q = null;
        while (p != null && q == null) {
            if (p.info == datum) {
                q = p;
            } else {
                p = p.link;
            }
        }
        return q;
    }
}
