package com.company;

class Square {
    int a;

    int area() {
        return a * a;
    }

    int perimeter() {
        return 4 * a;
    }

}

public class oops_practice_3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.a = 10;
        System.out.println("The area of the square is " + sq.area());
        System.out.println("The area of the square is " + sq.perimeter());
    }
}
