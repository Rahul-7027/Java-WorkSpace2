package com.company;

public class Practice14 {
    public static void main(String[] args) {
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        int min=0;
        for (int element:arr) {
            if (element<min)
            {
                min=element;
            }
        }
        System.out.println("The minimum  value of array is : "+min);
    }
}
