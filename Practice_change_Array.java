package com.company;

public class Practice_change_Array {
    static void change(int a)
    {
        a=90;
    }

    static void change2(int[] arr)
    {
        arr[0]=96;
    }
    public static void main(String[] args) {
        // Case:1 Changing the Integer
        int x=45;
        change(x);
        System.out.println(x);

        // Case:2 Changing the Array
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        change2(arr);
        System.out.println("The value after changing : "+arr[0]);
    }
}
