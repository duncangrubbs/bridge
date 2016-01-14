package com.duncangrubbs.bridge;

import java.util.Scanner;

public class Main extends Hand{

    public Scanner input = new Scanner(System.in);

    public void instructions(){
        System.out.println("Welcome to the Bridge Program");
        System.out.println("How to Use:");
        System.out.println("1: Enter the values for each input");
        System.out.println("2: Card numbers are 1-10 and face cards follow");
        System.out.println("11 = Jack ... 14 = Ace");
        System.out.println("If there is no trump, enter none");
    }

    public void userInput(){
        System.out.println("Enter your hand");

        System.out.println("First card suit: ");
        System.out.println("First card number: ");

        System.out.println("Second card suit: ");
        System.out.println("Second card number: ");

        System.out.println("Third card suit: ");
        System.out.println("Third card number: ");

        System.out.println("Fourth card suit: ");
        System.out.println("Fourth card number: ");
    }

    public void trump(){

    }

    public Main () {}


    public static void main(String[] args){
        Main obj = new Main();
        obj.instructions();
    }


}
