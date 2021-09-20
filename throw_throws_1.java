package com.company;

class NegativeRadiusException1 extends Exception
{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class throw_throws_1 {
    public static double area(int r) throws NegativeRadiusException1{
        if (r<0){
            throw new NegativeRadiusException1();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        try{
            double ar = area(8);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
