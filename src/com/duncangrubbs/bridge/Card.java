package com.duncangrubbs.bridge;

/**
 * Created by Duncan on 1/12/2016.
 */
public class Card {

    public static final String CLUB = "CLUB";
    public static final String HEART = "HEART";
    public static final String SPADE = "SPADE";
    public static final String DIAMOND = "DIAMOND";

    String suit;
    int number;

    public Card() {}

    public Card(String s, int n) {
        suit = s;
        number = n;
    }

}
