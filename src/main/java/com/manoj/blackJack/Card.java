package com.manoj.blackJack;

public class Card {

	public String cardRank;
	public int cardValue;
	public String getCardRank() {
		return cardRank;
	}
	public void setCardRank(String cardRank) {
		this.cardRank = cardRank;
	}
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public Card(String cardRank, int cardValue) {
		super();
		this.cardRank = cardRank;
		this.cardValue = cardValue;
	} 
	
}
