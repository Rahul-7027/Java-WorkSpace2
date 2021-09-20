package com.company;

import com.sun.org.apache.xerces.internal.util.XMLEntityDescriptionImpl;

interface Camera
{
    void TakeShot();
    void record4k();
}

interface GPS {
    void turningOn();
}
interface MediaPlayer{
    void PlayMusic();
}

class MyCellPhone1 {
    public void playGame()
    {
        System.out.println("Play game ....");
    }
}

class SmartPhone extends MyCellPhone1 implements Camera,GPS,MediaPlayer
{
    @Override
    public void TakeShot() {
        System.out.println("Click a photo");
    }

    @Override
    public void record4k() {
        System.out.println("Recording 4k videos");
    }

    @Override
    public void turningOn() {
        System.out.println("GPS turning on this mobile");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Play music on the phone");
    }
}
public class Polymorphism_interface {
    public static void main(String[] args) {
        GPS g1=new SmartPhone();
        g1.turningOn();

        SmartPhone s1=new SmartPhone();
        s1.PlayMusic();
        s1.record4k();
        s1.TakeShot();
        s1.turningOn();
        s1.playGame();
    }
}
