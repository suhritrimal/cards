package com.suhrit.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private int cardsUsed;
	private List<Card> deck;
	private int initialDeckSize;

	public Deck() {
		initDeck();
	}

	public int cardsRemaining() {
		return deck.size();
	}

	public void shuffle() {
		if(deck.size() < initialDeckSize)
			throw new IllegalStateException("Deck is complete. Cannot shuffle");

		Collections.shuffle(deck);
	}

	public Card dealCard() {
		if(cardsUsed == initialDeckSize)
			throw new IllegalStateException("Deck is empty.");

		cardsUsed++;

		Card cardForDeal =  deck.get(cardsUsed - 1);
		deck.remove(cardsUsed - 1);

		return cardForDeal;
	}

	private void initDeck() {
		deck = new ArrayList<>();
		initialDeckSize = 0;

		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
				initialDeckSize++;
			}
		}

		cardsUsed = 0;
	}

	public void displayDeck() {
		deck.forEach(System.out::println);
	}
}
