package com.company;

public class Practice13 {
    public static void main(String[] args) {
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        int max=0;
        for (int element:arr) {
            if (element>max)
            {
                max=element;
            }
        }
        System.out.println("The maximum value of the array is : "+max);
    }
}
