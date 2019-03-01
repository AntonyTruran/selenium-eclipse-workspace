package com.qa.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qa.blackjackTests.InvalidResultsTest;

@RunWith(Suite.class)
@SuiteClasses({InvalidResultsTest.class})
public class InvalidResutlsSuite {

}
