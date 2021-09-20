package com.company;

import java.util.Scanner;

public class RunTime_error {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        try {
            System.out.println("Integer is 1000 divide by k : "+1000/k);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
