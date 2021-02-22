package me.boukadi.lambdas;

import java.util.function.Supplier;

public class SuppplierInterface {
	public static void main(String[] args) {
		Supplier<String> greet = () -> "Hey there.";
		String result = greet.get(); // the LEX its executed only if we explicitly call it here.
		System.out.println(result);
	}
}
