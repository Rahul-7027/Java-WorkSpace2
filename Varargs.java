package com.company;

public class Varargs {
    static int sum(int ...arr)
    {
        int result=0;
        for (int e:arr) {
           result+=e;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is : "+sum(4,5));
        System.out.println("The sum of 4 ,3 and 5 is : "+sum(4,3,5));
        System.out.println("The sum of 4 ,2,3and 5 is : "+sum(4,2,3,5));
        System.out.println("The sum of 4 , 32, 12 and 5 is : "+sum(4,32,12,5));

    }
}
