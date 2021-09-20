package com.company;

class  Rectangle7
{
    int length=10;
    int width=30;
    public int area()
    {
        return length*width;
    }
}
class Square7 extends Rectangle7
{
    int side=10;
    public int area()
    {
        return side*side;
    }
}
class Circle7 extends Square7
{
    int radius=10;
    public int area()
    {
        return (int) (Math.PI*radius*radius);
    }
}
class Cylinder7 extends Circle7
{
    int height=10;
    public int perimeter()
    {
        return (int) (2*Math.PI*radius*height);
    }
}
class Sphere7 extends Circle7
{
    public int area()
    {
        return (int) (4*Math.PI*radius*radius);
    }
}
public class oops_practice_7 {
    public static void main(String[] args) {
        /*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.company.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */


    }
}
