package me.boukadi.exceptions;

public class Test {

	public static void main(String[] args) {
		Compte cmpt = new Compte();
		try {
			cmpt.withdraw(100);
		} catch (CompteException e) {
			// SoldeMakafichException hya cause dyal CompteException
			System.out.println(e.getCause().getMessage());
		}
	}
	
	

}
