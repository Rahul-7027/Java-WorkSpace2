package com.company;

class TommyVercetti{

    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public void running()
    {
        System.out.println("Running .........");
    }
    public void fire()
    {
        System.out.println("Firing the gun on the enemy");
    }
}
public class oops_practice_5 {
    public static void main(String[] args) {
        TommyVercetti t1=new TommyVercetti();
        t1.fire();
        t1.hit();
        t1.running();
    }
}
