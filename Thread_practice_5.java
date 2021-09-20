package com.company;
class MyThr3 extends Thread
{
    public MyThr3(String name) {
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
public class Thread_practice_5 {
    public static void main(String[] args) {
        MyThr3 t1=new MyThr3("Rahul");
        MyThr3 t2=new MyThr3("Rahul1 + (Most important)");
        MyThr3 t3=new MyThr3("Rahul + (Low purity)");
        MyThr3 t4=new MyThr3("Rahul");
        MyThr3 t5=new MyThr3("Rahul");
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        System.out.println(t1.getId());
        System.out.println(t5.getPriority());
        System.out.println(t1.getThreadGroup());

    }
}
