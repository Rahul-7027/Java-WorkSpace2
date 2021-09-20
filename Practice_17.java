package com.company;

public class Practice_17 {
    static int factorial(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x=10;
        System.out.println("The value of first natural number is "+factorial(x));
    }
}
