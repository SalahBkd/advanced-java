package me.boukadi.lambdas;

import java.util.function.Predicate;

public class PredicateInterface {
	public static void main(String[] args) {
		Predicate<String> isGreaterThan5 = (str) -> str.length() > 5;
		Predicate<String> isLesserThan10 = (str) -> str.length() < 10;
		
		boolean res1 = isGreaterThan5.and(isLesserThan10).test("salam.");
		//res1 = isGreaterThan5.test("salam.");
		
		// we have AND (&&), NEGATE (!), OR (||) 
		
		System.out.println(res1);
	}
}
