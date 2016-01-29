package com.duncangrubbs.bridge;

import java.util.Scanner;

public class Main extends Hand{

    public static Scanner input = new Scanner(System.in);
    public static final String[] READABLE_INDEX = {
            "First",
//            "Second",
//            "Third"
            // TODO: add more
    };

    public static Hand hand = new Hand();

    public static void showInstructions() {
        System.out.println("Welcome to the Bridge Program");
        System.out.println("How to Use:");
        System.out.println("1: Enter the values for each input");
        System.out.println("2: Card numbers are 2-10 and face cards follow");
        System.out.println("11 = Jack ... 14 = Ace");
        System.out.println("If there is no trump, enter none");
    }

    public static void populateHand() {
        System.out.println("Enter your hand");

        for (String readableIndex : READABLE_INDEX) {
            Card card = new Card();
            System.out.println(readableIndex + " card suit: ");
            // TODO: validate suit
            card.setSuit(input.next());

            System.out.println(readableIndex + " card number: ");
            // TODO: validate number
            card.setNumber(input.nextInt());

            hand.addCard(card);
        }
    }

    public void trump() {

    }

    public static void main(String[] args) {
        showInstructions();
        populateHand();
        System.out.printf("You have %d points\n", hand.getPoints());
    }

}
