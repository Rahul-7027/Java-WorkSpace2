package com.company;

interface Drawable
{
    void draw();
    public static int cube(int a)
    {
        return a*a*a;
    }
}
class Rectangle6 implements Drawable{
    @Override
    public void draw() {
        System.out.println("show shape");
    }
}
public class TestInterfaceStatic {
    public static void main(String[] args) {
        Rectangle6 r6=new Rectangle6();
        r6.draw();
        System.out.println(Drawable.cube(5));
    }
}
