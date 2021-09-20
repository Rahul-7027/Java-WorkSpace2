package com.company;

public class while_factorial {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        int fact=1;
        while (i<=n)
        {
            fact*=i;
            ++i;
        }
        System.out.printf("Factorial is %d = %d ",n,fact);
    }
}
