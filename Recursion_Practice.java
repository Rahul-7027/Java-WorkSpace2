package com.company;

public class Recursion_Practice {
    static int fact(int n){
        if (n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println("The value of 10 is : "+fact(n));
    }
}
