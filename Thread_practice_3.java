package com.company;

class MyThread3 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Good Morning");
        }
    }
}
class MyThread4 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Welcome");
        }
    }
}
public class Thread_practice_3 {
    public static void main(String[] args) {
        MyThread3 t3=new MyThread3();
        MyThread4 t4=new MyThread4();
        t3.start();
        t4.start();
    }
}
