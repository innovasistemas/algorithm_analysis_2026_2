package com.packages.linked_list;

public class LinkedDoubleList 
{
    public NodeLDL head;
    public NodeLDL last;
    public int n;

    public LinkedDoubleList()
    {
        head = null;
        last = null;
        n = 0;
    }

    public void addNodeLDLEnd(int datum)
    {
        NodeLDL p = new NodeLDL();
        p.info = datum;
        if (head == null) {
            head = p;
        } else {
            last.rightLink = p;
        }
        p.leftLink = last;
        p.rightLink = null;
        last = p;
        n++;
    }

    public void showLDL()
    {
        NodeLDL p = head;
        System.out.println("Total nodos: " + n);
        while (p != null) {
            if (p.rightLink != null) {
                if (p.leftLink != null) {
                    System.out.print("<---[ " + p.info + " ]---> ");
                } else {
                    System.out.print("|||---[ " + p.info + " ]---> ");
                }
            } else {
                if (p.leftLink != null) {
                    System.out.print("<---[ " + p.info + " ]---||| ");
                } else {
                    System.out.print("|||---[ " + p.info + " ]---||| ");
                }
            }
            p = p.rightLink;
        }
    }

    public NodeLDL searchNodeLDL(int datum)
    {
        NodeLDL p = head;
        while (p != null && p.info != datum) {
            p = p.rightLink;
        }
        return p;
    }

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
