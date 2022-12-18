package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

 // here we have our deck class, the deck is a List of cards here. I tried a couple other ways, I tried using enums for a while but that was tricky. 
// Then I tried a key/value system where the key was the String of the card, "Two of Hearts", "Ace of Clubs" and the value was int- because I thought
// well keys can't be duplicates and I'll have no duplicate cards, but plenty of duplicate values I can just line it up that way. That proved tricky. 

 public class Deck {
	 
	
	 List<Card> cards = new ArrayList<Card>();
	 
	 public Deck() {
		  
		 for ( int n = 0; n < 4; n++) {
			 for (int v = 2; v <= 14; v++) {
				 cards.add(new Card ( n, v));
				 }
			 }
	 }
	
public List<Card> getCards() {
	return cards;
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}

// here is the draw method, this is what players use make their hands. each player will get a 'drawCard' which is the card in the first place of the newly made deck list, as each card is 'get' the card is then removed from the deck list
public Card draw() {
	if (cards.isEmpty()) {
		return null;
	} else {
		Card drawCard = cards.get(0);
		cards.remove(0);
		return drawCard;
	}
}

 // i like that shuffle is something java already does, it makes me think they made a lot of card games when making java to say hey lets give this to everyone. 
public void shuffle() {
	Collections.shuffle(cards);
}
 
}

 