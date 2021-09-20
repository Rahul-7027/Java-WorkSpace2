package com.company;

import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int[] marks={21,32,43,54};
        System.out.println("Enter Your index : ");
        Scanner sc=new Scanner(System.in);
        int ind=sc.nextInt();

        try {
            System.out.println("Welcome to my laptop");
            try {
                System.out.println("Array index is : "+marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Sorry this index does not exist ");
                System.out.println(e);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
