package com.company;

public class Switch_Example {
    public static void main(String[] args) {
        String name="Rahul";
        switch (name)
        {
            case "Rahul":
            {
                System.out.println("You are an adult");
            }
            break;
            case "Harry":
            {
                System.out.println("You are join to job");
            }
            break;
            case "Neha":{
                System.out.println("Get Retired");
            }
            break;
            default:
                System.out.println("Enjoy your Life! ");
        }
    }
}
