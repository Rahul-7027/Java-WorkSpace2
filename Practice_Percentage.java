package com.company;

import java.util.Scanner;

public class Practice_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Hindi Marks : ");
        int Hindi= sc.nextInt();
        System.out.println("Enter Your English Marks : ");
        int English=sc.nextInt();
        System.out.println("Enter Your Math Marks : ");
        int Math=sc.nextInt();
        int avg=(Hindi+English+Math)/3;
        System.out.println("Your overall Percentage is : "+avg);
       if (avg>=40 && Hindi>33 && English>33 && Math>33) {
           System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }
       }
    }
