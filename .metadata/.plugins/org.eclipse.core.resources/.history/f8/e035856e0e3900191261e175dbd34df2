package com.qa.blackjack;

public class Game {

	public void game() {
		CardGeneration card = new CardGeneration();
		int playerHand = 0;
		int dealerHand = 0;
		for (int player=1; player<=2; player++) {
			playerHand=card.newCard(playerHand);
		}
		for (int dealer=1; dealer<=2; dealer++) {
			playerHand=card.newCard(dealerHand);
		}
		// call card for each player generate two cards ask if they want to play
		// third card will auto head to winner

	}

	public int winner(int playerHand, int dealerHand) {
		int winningNumber = 0;
		if (playerHand > 21 && dealerHand > 21) {
			return winningNumber;
		} else if (playerHand > 21 && dealerHand <= 21) {
			return dealerHand;
		}else if (playerHand <= 21 && dealerHand > 21) {
			return playerHand;
		}else {
			return Math.max(playerHand, dealerHand);
		}
	}

}
