package com.company;

class MyThread1 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("MyThread is running ");
            System.out.println("I am happy");
        }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("I am happy");
            System.out.println("This is good");
        }
    }
}
public class Thread_Practice {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
