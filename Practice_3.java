package com.company;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Year : ");
        int year=sc.nextInt();
        if (((year%4==0)&& (year % 100 !=0)) || (year % 400==0))
        {
            System.out.println("Leap Year ");
        }
        else{
            System.out.println("Common Year");
        }
    }
}
