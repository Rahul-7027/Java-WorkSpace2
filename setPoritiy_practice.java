package com.company;

class MyThr1 extends Thread
{
    public MyThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true)
        {
//            System.out.println("This is thread ");
            System.out.println("This name "+getName());
        }
    }
}
public class setPoritiy_practice {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("Rahul + (most important)");
        MyThr1 t2=new MyThr1("Bhatia");
        MyThr1 t3=new MyThr1("Neha ");
        MyThr1 t4=new MyThr1("Rahul1");
        MyThr1 t5=new MyThr1("Gaurav + (most important)");
        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getId());
        System.out.println(t1.getName());
//        t1.start();
//        t5.start();

    }
}
