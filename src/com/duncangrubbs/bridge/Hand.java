package com.duncangrubbs.bridge;

/**
 * Created by Duncan on 1/12/2016.
 */
public class Hand {

    private Card[] hand = new Card[13];
    private int lastIndex = 0;

    /**
     * Add a card to the end of the hand.
     *
     * If hand is full, remove the first card.
     *
     * @param card Card to be added.
     */
    public void addCard(Card card) {
        lastIndex++;
        // check for overflow (lastIndex >= hand.length)
        hand[lastIndex] = card;
    }

    /**
     * Remove card at index and remove it.
     *
     * @param index Index of card to be removed.
     * @return Card at index.
     */
    public Card popCard(int index) {
        Card card = hand[index];
        hand[index] = null;
        // push up cards after index
        return card;
    }
}
