package com.company;

public class using_recursion_with_method {
    static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else {
            return n+sum(n-1);

        }
    }
    public static void main(String[] args) {
        int a=sum(3);
        System.out.println(a);
    }
}
