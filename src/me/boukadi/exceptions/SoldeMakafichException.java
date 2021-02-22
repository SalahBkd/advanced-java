package me.boukadi.exceptions;

public class SoldeMakafichException extends Exception {
	
	public SoldeMakafichException() {
		super("tqada solde.");
	}
	
	public SoldeMakafichException(String msg) {
		super(msg);
	}
}
