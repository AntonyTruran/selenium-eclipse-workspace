package com.qa.blackjack;

import java.util.Random;

public class CardGeneration {

	public int validCheck(int handNumber) {
		if(handNumber <4 || handNumber>31) {
			return handNumber = -1;
		}
		return handNumber;
	}

	public int newCard(int handNumber) {
		handNumber += new Random().nextInt(11)+2;
		return handNumber = validCheck(handNumber);
	}

}
