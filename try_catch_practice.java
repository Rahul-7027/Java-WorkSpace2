package com.company;

public class try_catch_practice {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e)
        {
            System.out.println("We failed to Reason. divide");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}

