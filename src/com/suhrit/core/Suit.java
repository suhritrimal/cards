package com.suhrit.core;

public enum Suit {
	SPADE(1, "Spade"),
	HEARTS(2, "Hearts"),
	CLUB(3, "Club"),
	DIAMOND(4, "Diamond");

	private final Integer suitRank;
	private final String suitName;

	Suit(Integer suitRank, String suitName) {
		this.suitRank = suitRank;
		this.suitName = suitName;
	}

	public Integer getSuitRank() {
		return suitRank;
	}

	public String getSuitName() {
		return suitName;
	}

	@Override
	public String toString() {
		return "Suit{" +
				"suitName='" + suitName + '\'' +
				'}';
	}
}
