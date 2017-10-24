package com.suhrit.core;

public enum Rank {

	ACE(1, "Ace"),
	TWO(2, "Two"),
	THREE(3, "Three"),
	FOUR(4, "Four"),
	FIVE(5, "Five"),
	SIX(6, "Six"),
	SEVEN(7, "Seven"),
	EIGHT(8, "Eight"),
	NINE(9, "Nine"),
	TEN(10, "Ten"),
	JACK(11, "Jack"),
	QUEEN(12, "Queen"),
	KING(13, "King");

	private final Integer rankNum;
	private final String rankName;

	Rank(Integer rankNum, String rankName) {
		this.rankNum = rankNum;
		this.rankName = rankName;
	}

	public Integer getRankNum() {
		return this.rankNum;
	}

	public String getRankName() {
		return rankName;
	}

	@Override
	public String toString() {
		return "Rank{" +
				"rankNum=" + rankNum +
				", rankName='" + rankName + '\'' +
				'}';
	}
}
