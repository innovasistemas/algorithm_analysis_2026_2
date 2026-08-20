package com.packages.primes;

public class PrimeNumbers 
{
    public boolean prime1(int num) 
    {
        int i = 2;
        boolean sw = true; // supuesto: El número es primo
        while (sw && i < num) {
            if (num % i == 0) {
                sw = false;
            } else {
                i++;
            }
        }
        return sw;
    }

    public boolean prime2(int num) 
    {
        int i = 2;
        boolean sw = true; // supuesto: El número es primo
        while (sw && i <= num / 2) {
            if (num % i == 0) {
                sw = false;
            } else {
                i++;
            }
        }
        return sw;
    }

    public boolean prime3(int num) 
    {
        int i = 2;
        boolean sw = true; // supuesto: El número es primo
        while (sw && i < Math.sqrt(num)) {
            if (num % i == 0) {
                sw = false;
            } else {
                i++;
            }
        }
        return sw;
    }

    public boolean prime4(int num) 
    {
        int i = 2;
        boolean sw = true; // supuesto: El número es primo
        if (num % i == 0) {
            sw = false;
        } else if (num <= 1) {
            sw = false;
        } else {
            i++;
        }
        while (sw && i <= Math.sqrt(num)) {
            if (num % i == 0) {
                sw = false;
            } else {
                i+=2;
            }
        }
        return sw;
    }
}
