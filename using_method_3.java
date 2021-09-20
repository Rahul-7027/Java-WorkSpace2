package com.company;

public class using_method_3 {
    static int rec(int n)
    {
        if (n>0)
        rec(n-1);
        {
            for (int i = n; i >=0 ; i--) {
            System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        rec(6);
    }
}
