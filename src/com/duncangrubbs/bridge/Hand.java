package com.duncangrubbs.bridge;

/**
 * Created by Duncan on 1/12/2016.
 *
 * A collection of cards.
 */
public class Hand {

    private Card[] cards = new Card[13];
    private int lastIndex = 0;
    protected static int sum;

    /**
     * Add a card to the end of the hand.
     *
     * If hand is full, remove the first card.
     *
     * @param card Card to be added.
     */
    public void addCard(Card card) {
        lastIndex++;
        // check for overflow (lastIndex >= cards.length)
        cards[lastIndex] = card;
    }

    /**
     * Remove card at index and remove it.
     *
     * @param index Index of card to be removed.
     * @return Card at index.
     */
    public Card popCard(int index) {
        Card card = cards[index];
        cards[index] = null;
        // push up cards after index
        return card;
    }

    public int getPoints() {

        for (Card card : cards) {
            if (card != null)
                sum += card.getPoints();
        }
        return sum;
    }

}
