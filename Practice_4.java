package com.company;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Website : ");
        String web=sc.nextLine();
        if (web.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if (web.endsWith(".org"))
        {
            System.out.println("Organization Website");
        }
        else if (web.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else {
            System.out.println("Valid Website");
        }
    }
}
