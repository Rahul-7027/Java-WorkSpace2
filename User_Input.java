package com.company;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" Have a good day");
    }
}
