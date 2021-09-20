package com.company;

class Animal{
    public void eat()
    {
        System.out.println("Eating the food");
    }
}
class Dog extends Animal
{
    public void speak()
    {
        System.out.println("barking..");
    }
}
public class Quick_Quiz_inheritance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.speak();
    }
}
