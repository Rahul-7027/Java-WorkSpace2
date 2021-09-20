package com.company;

public class Sorted_Detect {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
    if (isSorted)
    {
        System.out.println("Array is sorted ");
    }
    else {
        System.out.println("Array is not sorted");
    }
    }

}
