package com.company;

class Cellphone
{
    public void ring()
    {
        System.out.println("Ringing the call");
    }
    public void music()
    {
        System.out.println("Play music");
    }
    public void vib()
    {
        System.out.println("Vibrating the mobile");
    }
}
public class oops_practice_2 {
    public static void main(String[] args) {
        Cellphone c1=new Cellphone();
        c1.music();
        c1.ring();
        c1.vib();
    }
}
