package com.company;

interface Bank1{
    public int  rateOfInterest();
}

class SBI1 implements  Bank1
{
    @Override
    public int rateOfInterest() {
        return 2;
    }
}
class ICIC1 implements  Bank1{
    @Override
    public int rateOfInterest() {
        return 4;
    }
}
class AXIS1 implements Bank1{
    @Override
    public int rateOfInterest() {
        return 6;
    }
}
public class TestInterface2 {
    public static void main(String[] args) {
        SBI1 s=new SBI1();
        System.out.println(s.rateOfInterest());
    }
}
