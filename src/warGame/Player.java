package warGame;

import java.util.LinkedList;
import java.util.List;

// here is the Player class, we give the newly made player object a name String, a score with int, and a hand will have many items so that is a List (of cards objects that will be made elsewhere)
public class Player {
	
	List<Card> hand = new LinkedList<>();
	int score;
	String name;
	
	//here we say when you make a player they will have a name and int associated with them
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	//  later we can get our player name using player.name instead
	public String getName() {
		return name;
	}
	
	// we only show the hand of each player at the start of the game, so this will be used once. we go through the hand and describe each card as it prints each line
	public void describe() {
		System.out.println(name + " has this in their opening hand: " );
		for (Card card : hand) {
			card.describe();
		}
		
	}
//here we put the cards into players hands, we split the 52 card deck evenly, adding each item from the list of deck to each hand list of the player object 
	public void draw(Deck deck) {
		for (int i = 1; 1 <= 26; i++) {
			Card card = deck.draw();
			hand.add(card);
		}
		
	}
	
	//we this method later to increase  the players score by one each time they win a battle.
	public void incrementScore() {
    score = getScore() + 1;
    
  }
	
	// we can use this method to summon the players current score
public int getScore() {
    return score;
  }
	
//here we have the war part of war, this method will be used later in the main app. It will take the top card of each players list, which is like the player playing the top card of their deck/hand, 
//the card is removed from the players hand list as it is played- moving the game forward each time this method is iterated later
	public Card flip() {
		Card topdeck = hand.get(0);
		hand.remove(0);
		return topdeck;
	}
	}

	 

 