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
        System.out.print("Nodos: " + n);
    }

    public NodeLDL searchNodeLDL(int datum)
    {
        NodeLDL p = head;
        while (p != null && p.info != datum) {
            p = p.rightLink;
        }
        return p;
    }

    public boolean deleteNodeLDL(NodeLDL dir)
    {
        boolean flag = false;
        if (head == dir) {
            head = head.rightLink;
            n--;
            flag = true;
        } else {
            dir.leftLink.rightLink = dir.rightLink;
            if (dir.rightLink != null) {
                dir.rightLink.leftLink = dir.leftLink;
            }
            n--;
            flag = true;
        }
        return flag;
    }
}
