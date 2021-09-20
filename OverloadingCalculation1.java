package com.company;

public class OverloadingCalculation1 {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        OverloadingCalculation1 oq=new OverloadingCalculation1();
        oq.sum(10,10);
        oq.sum(10,10,40);
    }
}
