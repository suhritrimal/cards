package com.suhrit;

import com.suhrit.core.Card;
import com.suhrit.core.Deck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.displayDeck();
        deck.shuffle();
        deck.displayDeck();
        Card card = deck.dealCard();
		System.out.println(card.toString());
    }
}
