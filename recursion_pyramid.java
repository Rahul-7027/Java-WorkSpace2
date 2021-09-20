package com.company;

public class recursion_pyramid {
    static int rec(int n)
    {
        if (n>0) {
            rec(n-1);
            for (int i = 1; i <=n ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        rec(7);
    }
}
