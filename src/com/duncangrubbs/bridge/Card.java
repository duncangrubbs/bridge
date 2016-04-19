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
    private int points;
    
    public Card() {}

    public Card(String s, int n, int points) {
        suit = s;
        number = n;
        points = this.getPoints();
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

    public void setPoints(){
        if(this.getNumber() == 11){
            points = 1;
        }else if(this.getNumber() == 12){
            points = 2;
        }else if(this.getNumber() == 13){
            points = 3;
        }else if(this.getNumber() == 14){
            points = 4;
        }else{
            points = 0;
        }
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
