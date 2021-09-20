package com.company;

class Rectangle{
    int length=10;
    int width=10;

    int perimeter()
    {
        return 2* (length + width);
    }
    int area()
    {
        return length*width;
    }
}
public class oops_practice_4 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        System.out.println("The ares of rectangle is : "+r1.area());
        System.out.println("The perimeter of rectangle is : "+r1.perimeter());
    }
}
