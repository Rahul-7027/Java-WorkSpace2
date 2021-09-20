package com.company;

class Bank
{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICIC extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    @Override
    int getRateOfInterest() {
        return 6;
    }
}
class AXIS extends Bank{
    @Override
    int getRateOfInterest() {
        return 5;
    }
}
public class overriding_Bank {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICIC i=new ICIC();
        AXIS a=new AXIS();
        PNB p=new PNB();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICIC Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
        System.out.println("PNB Rate of Interest: "+p.getRateOfInterest());

    }
}
