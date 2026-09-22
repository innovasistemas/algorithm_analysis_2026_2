package com.packages.arrays;

public class Vector {
    private final int T = 100000;
    private int n;
    private int vec[] = new int[T];

    public Vector() {
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

    public int getDatumVector(int pos) {
        return vec[pos];
    }

    public void addVector(int datum) {
        vec[n] = datum;
        n++;
    }

    public void fillVector() {
        final int LI = -50000;
        final int LS = 50000;
        for (int i = 0; i < T; i++) {
            vec[i] = (int) (Math.random() * (LS - LI + 1) + LI);
        }
        n = T;
    }

    public void showVector() {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }

    public int searchSequential(int datum) {
        int i = 0;
        int pos = -1; // Supuesto: dato no está
        while (pos == -1 && i < n) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public void bubbleSort() {
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

    public int searchBinary(int datum) {
        int pos = -1;
        int LI = 0;
        int LS = n;
        int centralPos;
        while (pos == -1 && LI <= LS) {
            centralPos = (LI + LS) / 2;
            if (vec[centralPos] == datum) {
                pos = centralPos;
            } else if (datum > vec[centralPos]) {
                LI = centralPos + 1;
            } else {
                LS = centralPos - 1;
            }
        }
        return pos;
    }

    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public String decryptMessage()
    {
        String msg = "";
        for (int i = 0; i < n; i++) {
            if (vec[i] >= 32 && vec[i] <= 126) {
                msg += (char)vec[i]; 
            }
        }
        return msg;
    }
}



