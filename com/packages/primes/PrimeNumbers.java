package com.packages.primes;
import com.packages.utils.*;

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

    public int newPrimeEuclides(int P[], int t)
    {
        Operations oper = new Operations();
        int x = oper.product(P, t);
        int y = x + 1;
        int d = 2;
        while (d > 1 && y % d != 0) {
            d += 1;
        }
        return d;
    }

    public int newPrimeWithoutEuclides(int P[], int t)
    {
        Operations oper = new Operations();
        int x = oper.maxArray(P, t) + 1;
        System.out.println(x);
        while (!prime4(x)) {
            x++;
        } 
        return x;
    }
}
