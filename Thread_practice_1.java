package com.company;

class Mythr extends Thread
{
    public Mythr(String name) {
        super(name);
    }
    public void run()
    {
        for (int i = 0; i <10; i++) {

        }
        System.out.println("Good Morning");
    }
}
public class Thread_practice_1 {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Rahul");
        t1.start();
        System.out.println(t1.getPriority());
    }
}