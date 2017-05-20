package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		
		//Result result = JUnitCore.runClasses(TestJUnit.class);
		Result result = JUnitCore.runClasses(TestJUnit2.class);
		//Result result = JUnitCore.runClasses(TestJUnit3.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
