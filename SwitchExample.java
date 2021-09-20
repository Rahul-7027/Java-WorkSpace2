package com.company;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt();
        switch (num)
        {
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
