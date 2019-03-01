package com.qa.blackjackTests;

import org.junit.Before;
import org.junit.Test;

import com.qa.blackjack.CardGeneration;
import com.qa.blackjack.Game;

import junit.framework.TestCase;

public class InvalidResultsTest extends TestCase{
	CardGeneration card;
	Game game;
	@Before
	public void setUp() {
		card = new CardGeneration();
		game = new Game();
	}
	@Test
	public void testBust() {
		assertEquals("both bust",0,game.winner(22,22));
	}
	@Test
	public void testValid() {
		assertEquals("invalid number received",-1,card.validCheck(3));
		assertEquals("invalid number received",-1,card.validCheck(32));
		assertEquals("invalid number received",-1,card.newCard(30));
	}
	

}
