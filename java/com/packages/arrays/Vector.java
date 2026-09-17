package com.packages.arrays;

public class Vector 
{
    private final int T = 100000;
    private int n;
    private int vec[] = new int[T]; 
    
    public Vector()
    {
        n = 0;
    }

    public int getT() {
        return T;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }

    public int getDatumVector(int pos)
    {
        return vec[pos];
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public void fillVector()
    {
        final int LI = -50000; 
        final int LS = 50000; 
        for (int i = 0; i < T; i++) {
            vec[i] = (int)(Math.random() * (LS - LI + 1) + LI);
        }
        n = T;
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }

    public int searchSequential(int datum)
    {
        int i = 0;
        int pos = -1; //Supuesto: dato no está
        while (pos == -1 && i < n) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public void bubbleSort()
    {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
}

