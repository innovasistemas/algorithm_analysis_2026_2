package com.packages.utils;

public class Operations 
{
    public void showArray(int P[], int t)
    {
        String out = "[";
        for (int i = 0; i < t; i++) {
            out += P[i] + ", ";
        }
        out += "]";
        System.out.print(out);
    }

    public int sumatory(int V[], int t)
    {
        int sum = 0;
        for (int i = 0; i < t; i++) {
            sum += V[i];
        }
        return sum;
    }

    public int product(int P[], int t)
    {
        int prod = 1;
        for (int i = 0; i < t; i++) {
            prod *= P[i];
        }
        return prod;
    }

    public int maxArray(int V[], int t)
    {
        int m = V[0];
        for (int i = 1; i < t; i++) {
            if (V[i] > m) {
                m = V[i];
            }
        }
        return m;
    }
}
