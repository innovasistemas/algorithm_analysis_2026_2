package com.packages.linked_list;

public class LinkedDoubleList 
{
    public NodeLDL head;
    public NodeLDL last;
    private int n;

    public LinkedDoubleList()
    {
        head = null;
        last = null;
        n = 0;
    }

    public NodeLDL addNodeLDLEnd(int datum)
    {
        NodeLDL p = new NodeLDL();
        p.info = datum;
        if (head == null) {
            head = p;
        } else {
            last.rl = p;
        }
        p.ll = last;
        p.rl = null;
        last = p;
        n++;
        return p;
    }

    public void showLDL(NodeLDL h)
    {
        NodeLDL p = h;
        System.out.println("Total nodos: " + n);
        while (p != null) {
            System.out.print("Información: [" + p.info + "] --->");
            p = p.rl;
        }
    }

    // public NodeLSL searchNodeLSL(int datum)
    // {
    //     NodeLSL p = head;
    //     NodeLSL q = null;
    //     while (p != null && q == null) {
    //         if (p.info == datum) {
    //             q = p;
    //         } else {
    //             p = p.link;
    //         }
    //     }
    //     return q;
    // }

    // public boolean deleteNodeLSL(int datum)
    // {
    //     boolean sw = false;
    //     if (head.info == datum) {
    //         head = head.link;
    //         n--;
    //         sw = true;
    //     } else {
    //         NodeLSL q = head;
    //         NodeLSL p = q.link;
    //         while (!sw && p != null) {
    //             if (p.info == datum) {
    //                 q.link = p.link;
    //                 n--;
    //                 sw = true;
    //             } else {
    //                 p = p.link;
    //                 q = q.link;
    //             }
    //         }
    //     }
    //     return sw;
    // }
}
