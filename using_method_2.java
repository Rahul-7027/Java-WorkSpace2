package com.company;

public class using_method_2 {
    static int pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return n;
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
