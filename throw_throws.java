package com.company;

public class throw_throws {
    public static int divide(int a,int b) throws ArithmeticException
    {
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        try {
            int result=divide(6,0);
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
