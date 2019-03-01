package com.qa.blackjackTests;

import org.junit.Before;
import org.junit.Test;

import com.qa.blackjack.Game;

import junit.framework.TestCase;

public class DealerResultTest extends TestCase{

	Game game;
	@Before
	public void setUp() {
		game = new Game();
	}
	@Test
	public void testDealerHighest() {
		assertEquals(16,game.winner(12,16));
	}
	@Test
	public void testPlayerBust() {
		assertEquals(12,game.winner(24,12));		
	}
}