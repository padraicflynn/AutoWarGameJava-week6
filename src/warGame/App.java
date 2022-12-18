package warGame;

 
// Hello! This is the second version of my war game. I will leave the original version for grading purposes as I wanted to submit before the deadline; I had a tough week outside of school which is subideal but happens.
// I'm excited for this version though, I added a lot of comments in all of the classes showing how our code works! I solved the problems I was having in the other version, and describe those in more detail. 

public class App {

	
	//this is the main string, i have a run method to kick off the game
	// we learned this from Dr.Rob's star wars game.
	// this just tell the main method to start the game using the run method below.
	
	public static void main(String[] args) {
	new App().run();
	}
	 
	
	// here we make new players, they are made from the player class and have 3 things associated with them, a name, score and a hand/list which will hold the cards. 
		public void run() {
			Player player1 = new Player("The Crying Lions");
			Player player2 = new Player("The Hunting Wolves");
			 
			// above we name our players, I wanted to use a scanner to just let people enter their name, and then have a random list of cool army titles. 
			// So you could enter "Padraic" and then it would add a string from a list chosen at random like " of the Purple Parrots", 
			// so each game would be a little more diffrent. 
			
			
			// here we declare war, the player name declares war with the second player name and print it out. 
			System.out.println(player1.name + " is going to war with " + player2.name);
			System.out.println();
			
			// this is where we build the deck and shuffle, we use the shuffle method defined later, and make a new deck each time the game is played.
			Deck deck = new Deck();
			deck.shuffle();
		 
			
			// here we make the players hands, the deck is split in 2 for a even 26, the cards are added to player1 and 2 which are objects that hold the cards and a score
			// we use a for loop to count up to half the deck, adding to the players hand/list each time we use the draw method on the deck list. 
			// this moves the newly made card elements from one list into another list, from the deck to the player
			for (int x = 1; x <= 26; x++) {
			player1.hand.add(deck.draw());
			player2.hand.add(deck.draw());
		}
		
			// here we print out the hands
			// we use the describe method on each list that is the player's hands
			
			 player1.describe();
			 System.out.println();
			 player2.describe();
			 System.out.println();
			 
			 
			 //here we set the turns, when the counter hits 26 the game ends which is good cause we'd run out of cards after that
			 // we use the flip method as the heart of the game, the battles.
			 // the flip method will get the top card of the player's hand and remove it from the list as it does
			 // this is like revealing each card and taking it away from the deck it came from
			 for (int counter = 1; counter <= 26; counter++ ) {
				 Card player1Hand = player1.flip();
				 Card player2Hand = player2.flip();
				 
			 
			 //here we add players score up
				 // each time a card is flipped they are compared, the greater value wins and the player score of int will go up by one- this is how you win!
			 if (player1Hand.getCardvalue() > player2Hand.getCardvalue()) {
				 player1.incrementScore();
				 
			 } else if (player2Hand.getCardvalue() > player1Hand.getCardvalue()) {
				 player2.incrementScore();
				 
			 } 
			 
			 
			 //here the players will be able to see the game played out
			 // I use the same strings to describe the action over and over, but you could probably make another list of cool sayings like " is summoning" or " sends forth the " 
			 // so each battle could be like a little story and diffrent every time
			 
			 if (player1Hand.getCardvalue() > player2Hand.getCardvalue()) {
			   
			        System.out.println(player1.name + " summoned warrior is the " + player1Hand.toString());
			        System.out.println(player2.name  + " has played the " + player2Hand.toString());
			      
			        
			        System.out.println(player1.name  +  " has taken this battle!");
			        System.out.println(player1.name + " battles won so far " + player1.score);
			        System.out.println(player2.name + " battles won so far " + player2.score);
			        System.out.println();
			   
			      }
			 
			 else if (player2Hand.getCardvalue() > player1Hand.getCardvalue()) {
				 System.out.println(player1.name + " has sent forth the " + player1Hand.toString());
				 System.out.println(player2.name + " will meet them with the " + player2Hand.toString());
				 System.out.println(player2.name  +  " has won this battle!");
			        System.out.println(player1.name + " battles won so far " + player1.score);
			        System.out.println(player2.name + " battles won so far " + player2.score);
			        System.out.println();
			 }
			 
			 else if (player1Hand.getCardvalue() == player2Hand.getCardvalue()) {
			      
			        System.out.println(player1.name  + " has drawn card: " + player1Hand.toString());
			        System.out.println(player2.name + " has drawn card: " + player2Hand.toString());
			        System.out.println("There are no winners! Both parties get nothing!");
			        System.out.println(player1.name + " sits idle with " + player1.score);
			        System.out.println(player2.name + " also awaits the next battle, having won " + player2.score);
			        System.out.println();
			    }
			 }
			 
			 
			 //here we print out the final scores at the end of the game, once we show the players the scores the next step is for the game to figure who won using the next bit
			 System.out.println("Player1 has won " + player1.score);
			 System.out.println("But Player2 has won " + player2.score);
			 
			 
			 // and here we compare the final scores which will let us declare a winner or not. 
			 if (player1.score > player2.score) {
				 System.out.println("Player1 has won the day!");
			 } else if (player1.score < player2.score) {
				 System.out.println("Player2 emerges the winner this day!");
			 } else if (player1.score == player2.score) {
				 System.out.println("This war is for naught! The war has ended, and only the crows are the victors... Both players lose!");
				 
			 
			 
			 }
		
			
			
		 	 
		 
}
}

 