package com.suhrit.core;

public class Card {

	private Rank rank;
	private Suit suit;

	Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card{" +
				"rank=" + rank +
				", suit=" + suit +
				'}';
	}
}
