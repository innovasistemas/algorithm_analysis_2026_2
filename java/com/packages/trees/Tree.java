package com.packages.trees;

import java.util.Scanner;

public class Tree 
{
    public NodeTree root;
    private static Scanner input = new Scanner(System.in);

    public Tree() {
        root = null;
    }

    public void preorder(NodeTree node) {
        if (node != null) {
            System.out.println(node.info);
            preorder(node.leftBranch);
            preorder(node.rightBranch);
        }
    }
    
    public void inorder(NodeTree node) {
        if (node != null) {
            inorder(node.leftBranch);
            System.out.println(node.info);
            inorder(node.rightBranch);
        }
    }

    public void postorder(NodeTree node) {
        if (node != null) {
            postorder(node.leftBranch);
            postorder(node.rightBranch);
            System.out.println(node.info);
        }
    }

    public void loadNode(NodeTree node) {
        NodeTree newNode;
        String resp;
        System.out.print("Ingrese el dato para el árbol: ");
        node.info = input.nextInt();
        input.nextLine();

        System.out.print("¿Desea agregar nodos por la rama izquierda de " + node.info + "? [S/?]");
        resp = input.next();
        if (resp.toUpperCase().equals("S")) {
            newNode = new NodeTree();
            node.leftBranch = newNode;
            loadNode(node.leftBranch);
        } else {
            node.leftBranch = null;
        }
        System.out.print("¿Desea agregar nodos por la rama derecha de " + node.info + "? [S/?]");
        resp = input.next();
        if (resp.toUpperCase().equals("S")) {
            newNode = new NodeTree();
            node.rightBranch = newNode;
            loadNode(node.rightBranch);
        } else {
            node.rightBranch = null;
        }
    }

    public void countLeaves(NodeTree node, int count[]) {
        if (node != null) {
            if (node.leftBranch == null && node.rightBranch == null) {
                count[0]++;
            }
            countLeaves(node.leftBranch, count);
            countLeaves(node.rightBranch, count);
        }
    }
}
