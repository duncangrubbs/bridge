package com.duncangrubbs.bridge;

/**
 * Created by Duncan on 1/12/2016.
 *
 * Representation of a card with a suit and a number.
 */
public class Card {

    public static final String CLUB = "CLUB";
    public static final String HEART = "HEART";
    public static final String SPADE = "SPADE";
    public static final String DIAMOND = "DIAMOND";

    private String suit;
    private int number;
    private int points = 0;
    
    public Card() {}

    public Card(String s, int n) {
        suit = s;
        number = n;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public int getPoints() {
        return points;
    }

    public void setSuit(String newSuit) {
        suit = newSuit;
    }

    public void setNumber(int newNumber) {
        number = newNumber;
        if (newNumber > 10) {
            points = newNumber % 10;
        }
    }
}
