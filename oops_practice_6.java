package com.company;

class Circle{
    int radius=10;
    int area()
    {
        return (int) (Math.PI*radius*radius);
    }
    int perimeter()
    {
        return (int) (2*Math.PI*radius);
    }
}
public class oops_practice_6 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("the area of the circle is : "+ c1.area());
        System.out.println("and the perimeter of the circle is : "+ c1.perimeter());
    }
}
