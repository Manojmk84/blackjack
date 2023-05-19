package com.manoj.blackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

	public String name;
	private List<Card> playerCards;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Players(String name) {
		super();
		this.name = name;
		playerCards  = new ArrayList<>();
	}
	
	public void AddCard(Card card)
    {
		playerCards.add(card);
    }
	
	public int getScore() {
	    int score = playerCards.stream().mapToInt(card -> card.getCardValue()).sum();

	    return score;
	}
	
	public String getCardsString() {
	    return String.join(", ", playerCards.stream().map(card -> card.getCardRank()).collect(Collectors.toList()));
	} 
	
}
