package com.qa.blackjackTests;

import org.junit.Before;
import org.junit.Test;

import com.qa.blackjack.Game;

import junit.framework.TestCase;

public class PlayerResultTest extends TestCase {

	Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void testPlayerHighest() {
		assertEquals(17, game.winner(17, 12));
	}

	@Test
	public void testDealerBust() {
		assertEquals(16, game.winner(16, 23));
	}
}
