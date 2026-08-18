package com.packages.arrays;

public class Matrix 
{
    private final int TR = 20;
    private final int TC = 20;
    private int m, n;
    private int mat[][] = new int[TR][TC]; 
    
    public Matrix()
    {
        m = 0;
        n = 0;
    }

    public int getTR() {
        return TR;
    }

    public int getTC() {
        return TC;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getMat() {
        return mat;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    public void fillMatrix()
    {
        int i, j;
        final int LI = 1;
        final int LS = 100;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = (int)(Math.random() * (LS - LI + 1) + LI);
            }
        }
    }

    public void showMatrix()
    {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }  
    
    public void mainDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i]);
        }
    }

    public void secondaryDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][n - i - 1]);
        }
    }

    public void triangularUp()
    {
        int i, j;
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.println(mat[i][j]);
            }
        }
    }
}
