package com.manoj.blackJack;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DeckClass {

	

	
	public List<Card> cards;
	private Random randomCard;
	
	public DeckClass() {
		randomCard = new Random();
	     Reset();
	}
	
	public void Reset()
    {
        cards = new ArrayList<>(Arrays.asList(
        		new Card("2 hearts", 2),
                new Card("3 hearts", 3),
                new Card("4 hearts", 4),
                new Card("5 hearts", 5),
                new Card("6 hearts", 6),
                new Card("7 hearts", 7),
                new Card("8 hearts", 8),
                new Card("9 hearts", 9),
                new Card("10 hearts", 10),
                new Card("J hearts", 10),
                new Card("K hearts", 10),
                new Card("Q hearts", 10),
                new Card("A hearts", 10),
                
                new Card("2 diamonds", 2),
                new Card("3 diamonds", 3),
                new Card("4 diamonds", 4),
                new Card("5 diamonds", 5),
                new Card("6 diamonds", 6),
                new Card("7 diamonds", 7),
                new Card("8 diamonds", 8),
                new Card("9 diamonds", 9),
                new Card("10 diamonds", 10),
                new Card("J diamonds", 10),
                new Card("K diamonds", 10),
                new Card("Q diamonds", 10),
                new Card("A diamonds", 10),
                
                new Card("2 clubs", 2),
                new Card("3 clubs", 3),
                new Card("4 clubs", 4),
                new Card("5 clubs", 5),
                new Card("6 clubs", 6),
                new Card("7 clubs", 7),
                new Card("8 clubs", 8),
                new Card("9 clubs", 9),
                new Card("10 clubs", 10),
                new Card("J clubs", 10),
                new Card("K clubs", 10),
                new Card("Q clubs", 10),
                new Card("A clubs", 10),
                
                new Card("2 spades", 2),
                new Card("3 spades", 3),
                new Card("4 spades", 4),
                new Card("5 spades", 5),
                new Card("6 spades", 6),
                new Card("7 spades", 7),
                new Card("8 spades", 8),
                new Card("9 spades", 9),
                new Card("10 spades", 10),
                new Card("J spades", 10),
                new Card("K spades", 10),
                new Card("Q spades", 10),
                new Card("A spades", 10)
        		));
        
    }
	
	public Card DrawCard()
    {
		int index = randomCard.nextInt(cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }
}
