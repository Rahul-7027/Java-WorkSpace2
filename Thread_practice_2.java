package com.company;

class PlayMusic extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("Play music");

        }
    }
}
public class Thread_practice_2 {
    public static void main(String[] args) {
        PlayMusic p1=new PlayMusic();
        System.out.println(p1.hashCode());
        }
    }
