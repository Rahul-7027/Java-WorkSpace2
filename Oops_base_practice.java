package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1{

    public int number;
    public int noOfGuesses;
    public int takeInput;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game1()
    {
        Random r=new Random();
        this.number=r.nextInt(100);
    }

    void takeuserInput()
    {
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        takeInput= sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (takeInput==number)
        {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
return true;
        }
        else if (takeInput<number)
        {
            System.out.println("Too low....");
        }
        else if (takeInput>number)
        {
            System.out.println("Too high.....");
        }
        return false;
    }

}
public class Oops_base_practice {
    public static void main(String[] args) {
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
        Game1 g=new Game1();
        boolean b= false;
        while(!b){
            g.takeuserInput();
            b = g.isCorrectNumber();
        }
    }
}
