package com.packages.recursivity;

public class Recursion {

    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    } 

    public static int sumNaturalRecursive(int n) {
        if (n == 0) {
            return n;
        } else {
            return n + sumNaturalRecursive(n - 1);
        }
    }
}
