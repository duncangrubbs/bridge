package com.duncangrubbs.bridge;

public class Player {
    private Hand hand;
    private int score;
    private Player partner;

    public Player(Hand hand, int score, Player partner) {
        this.hand = hand;
        this.score = score;
        this.partner = partner;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player getPartner() {
        return partner;
    }

    public void setPartner(Player partner) {
        this.partner = partner;
    }
}
