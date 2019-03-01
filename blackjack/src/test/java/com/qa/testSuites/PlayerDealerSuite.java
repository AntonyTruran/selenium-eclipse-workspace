package com.qa.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qa.blackjackTests.DealerResultTest;
import com.qa.blackjackTests.PlayerResultTest;



@RunWith(Suite.class)
@SuiteClasses({PlayerResultTest.class,DealerResultTest.class})
public class PlayerDealerSuite {

}
