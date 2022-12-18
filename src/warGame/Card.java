package warGame;

import java.util.List;

 
// here we make the card class, we define both cardname and cardvalue as ints to make them easier to work with
public class Card {

	private int cardname;
	private int cardvalue;
	
	
	// here we make our suits into final ints, so they won't change and working with them as ints makes it easier down the line than converting an array of strings or adding key/value maps, I tried both and they proved tircky for where I am
	public static final int Spade = 0;
	public static final int Heart = 1;
	public static final int Diamond = 2;
	public static final int Club = 3;
	
	
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	
	
	//here we make what a card will be down the line, later we will use the method to string to take the ints of the card and say what they are such as "king of hearts"
	public Card(int cardname, int cardvalue) {
		 this.setCardname(cardname);
		 this.setCardvalue(cardvalue);
	}

	//here we have our get and set, 
	public int getCardname() {
		return cardname;
	}
	
//here we set the card name with this., java knows that this means the card its currently working with, which is pretty cool 
	public void setCardname(int cardname) {
		this.cardname = cardname;
	}

	
	//when i first made this version of the project i thought getting cardvalue and cardname would work but I never told it to use the toString method 
	public int getCardvalue() {
		return cardvalue;
	}

	public void setCardvalue(int cardvalue) {
		this.cardvalue = cardvalue;
	}
	
	//here we take our cards int values and convert them into pretty words like Ace and Hearts! 
	public String toString() {
		String s = "";
		if (cardvalue == Jack) {
			s += "Jack";
		} else if (cardvalue == Queen) {
			s += "Queen";
		} else if (cardvalue == King) {
			s += "King";
		} else if (cardvalue == Ace) {
			s += "Ace";
		} else if (cardvalue == 2) {
			s += "Two";
		} else if (cardvalue == 3) {
			s += "Three";
		} else if (cardvalue == 4) {
			s += "Four";
		} else if (cardvalue == 5) {
			s += "Five";
		} else if (cardvalue == 6 ) {
			s += "Six";
		} else if (cardvalue == 7) {
			s += "Seven";
		} else if (cardvalue == 8) {
			s += "Eight";
		} else if (cardvalue == 9) {
			s += "Nine";
		}else if (cardvalue == 10) {
			s += "Ten";
		} else {
			s += cardvalue;
		}
			
		
		if (cardname == Club) {
			s += " of Clubs";
		} else if (cardname == Diamond) {
			s += " of Diamonds";
		} else if (cardname == Spade) {
			s += " of Spades";
		} else if (cardname == Heart) {
			s += " of Hearts";
		} else if (cardname == Club) {
			s += " of Clubs";
		}
		return s;
		
	}
	
	// here we take the above converted ints to strings and say what the card actually is so the player can read it!
	 public void describe() {
		 System.out.println(this.toString() + " ");
		 
	 }
	 
	 
	 // this didn't work and should be removed
	  public int getCard() {
	 		return cardvalue + cardname;
	 	}
	}
	 
	

