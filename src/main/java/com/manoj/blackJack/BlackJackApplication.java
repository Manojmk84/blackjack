package com.manoj.blackJack;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BlackJackApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(BlackJackApplication.class, args);
		
		System.out.println("WELCOME TO BLACKJACK");
		
		int finalDealScore = 0;
		
		DeckClass deck = new DeckClass(); 
		List<Players> players = new ArrayList<>(Arrays.asList(
				new Players("player 1"),
				new Players("player 2"),
				new Players("player 3"),
				new Players("Dealer")
				));
		
		for (Players player : players) {
		    player.AddCard(deck.DrawCard());
		}
		
		
		// players game
		for (Players player : players) {
		    if(player.name != "Dealer") {

		    		System.out.println("Dealing to " + player.name + " cards "  + player.getCardsString() + " "+player.getScore());
		    
		    	
		    }else {
		    	System.out.println("Dealing to " + player.name + " cards Face Down "  );
		    }
		}
		
		for (Players player : players) {
		    if(player.name != "Dealer") {
		    	System.out.println("Dealing to " + player.name + " cards "  + player.getCardsString() +" "+ player.getScore()  + " hit or Stand ");
		    	while(player.getScore() < 21 ) {
		    		Scanner scanner = new Scanner(System.in);
		    		String choice = scanner.nextLine();
		    		if (choice.equals("hit"))
                    {
                        player.AddCard(deck.DrawCard());
                        System.out.println("Dealing to " + player.name + " cards "  + player.getCardsString() +" "+ player.getScore()  + " Hit or Stand ");
                    }
                    else if (choice.equals("stand"))
                    {
                        break;
                    }
                    else
                    {
                    	System.out.println("Invalid input. Try again.");
                    }
		    	}
		    	if(player.getScore() <= 21) {
			    	System.out.println("Dealing to " + player.name + " cards "  + player.getCardsString() +" "+ player.getScore()  + " Stands ");
		    	}else {
			    	System.out.println("Dealing to " + player.name + " cards "  + player.getCardsString() +" "+ player.getScore()  + " busted ");

		    	}
		    	
		    }
		}
		
		
		//dealers game
		
		Players dealer = players.stream().filter(player -> player.getName().equals("Dealer")).findFirst().orElse(null);
		if (dealer != null) {
		    
		    while (dealer.getScore() < 17) {
		        dealer.AddCard(deck.DrawCard());
		        System.out.println("Dealing to computer cards111 " + dealer.getCardsString() + " "+ dealer.getScore() + " hits "
		        		+ "");
		    }
		    if(dealer.getScore() <= 21) {
			    System.out.println("Dealing to computer cards " + dealer.getCardsString() + " "+dealer.getScore() + "Stands");
		    }else {
		    	 System.out.println("Dealing to computer cards " + dealer.getCardsString() + " "+dealer.getScore() + "Busted");
		    }
		    finalDealScore = dealer.getScore() ;
		    
		}
		
		for (Players player : players) {
		    if (!player.getName().equals("Dealer")) {
		        if (player.getScore() > 21) {
		            System.out.println("Scoring " + player.getName() + " has " + player.getScore()  + ": BUSTED! Dealer Wins!");
		        } else if (dealer != null && dealer.getScore() > 21) {
		            System.out.println("Scoring " +player.getName() + " has " + player.getScore() + " Dealer has " + finalDealScore + " Dealer busted " + player.getName() + ": Wins!");
		        } else if (player.getScore() == dealer.getScore()) {
		            System.out.println("Scoring " + player.getName() + " has " + player.getScore()  + " dealer has" + finalDealScore + ": TIE!");
		        } else if (player.getScore() > dealer.getScore()) {
		            System.out.println("Scoring " +player.getName() + " has " + player.getScore()  + " dealer has" + finalDealScore + " "  + player.getName() +": Wins!");
		        } else {
		            System.out.println("Scoring " +player.getName()  + " has " + player.getScore()  + " dealer has " + finalDealScore + " "  +"Dealer Wins!");
		        }
		    }
		}
		System.out.println("\nThanks for playing! Press Enter to exit.");
		
	}

}
