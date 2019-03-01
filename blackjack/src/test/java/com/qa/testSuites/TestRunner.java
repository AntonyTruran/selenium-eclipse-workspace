package com.qa.testSuites;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.qa.blackjackTests.DealerResultTest;
import com.qa.blackjackTests.PlayerResultTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestRunner {
	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		Scanner choice = new Scanner(System.in);
		System.out.println("enter which test suite you wish to run (1/2)");
		String userChoice = choice.nextLine();
		if (userChoice.equals("1")) {
			runner.suite1();
		} else if (userChoice.equals("2")) {
			runner.suite2();
		}else {
			System.out.println("invalid input");
		}
	}
	public void suite1() {
		Result result = JUnitCore.runClasses(DealerResultTest.class,PlayerResultTest.class);
		System.out.println("all results passed "+result.wasSuccessful());
		
		if(!result.wasSuccessful()) {
			System.out.println("failed tets: ");
			for(Failure failure:result.getFailures()) {
				System.out.println(failure.getMessage());
			}
		}
	}
	public void suite2()  {
		Result result = JUnitCore.runClasses(DealerResultTest.class,PlayerResultTest.class);
		System.out.println("all results passed "+result.wasSuccessful());
		
		if(!result.wasSuccessful()) {
			System.out.println("failed tets: ");
			for(Failure failure:result.getFailures()) {
				System.out.println(failure.getMessage());
			}
		}
	}
}