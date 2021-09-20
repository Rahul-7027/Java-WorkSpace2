package com.company;

class MyRunnable1 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            System.out.println("I am a thread 1 and not threat 2");
        }
    }
}
class MyRunnable2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            System.out.println("I am thread2 and not threat 2");
        }
    }
}
public class Runnable_Thread_practice {
    public static void main(String[] args) {
        MyRunnable1 r1=new MyRunnable1();
        Thread t1=new Thread(r1);
        MyRunnable2 r2=new MyRunnable2();
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}
