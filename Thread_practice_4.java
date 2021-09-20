package com.company;

class MyThr5 extends Thread
{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning");
        }
    }
}

class MyThr6 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Welcome");
        }
    }
}
public class Thread_practice_4 {
    public static void main(String[] args) {
        MyThr5 t5=new MyThr5();
        MyThr6 t6=new MyThr6();
        t5.start();
        t6.start();
    }
}
