package com.company;

class MyThr4 extends Thread
{
    public MyThr4(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("This name "+getName());
        }

    }
}
public class Thread_Practice_6 {
    public static void main(String[] args) {
        MyThr4 t1=new MyThr4("Rahul");
        MyThr4 t2=new MyThr4("Rahul1 + (Most important)");
        MyThr4 t3=new MyThr4("Rahul + (Low purity)");
        MyThr4 t4=new MyThr4("Rahul");
        MyThr4 t5=new MyThr4("Rahul");
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread());
    }
}
