package me.boukadi.generics;

public class TestPoorGenericClass {
	public static void main(String[] args) {
//		PoorGenericClass genericClass = new PoorGenericClass();
//		genericClass.add(Integer.valueOf(10));
//		genericClass.add("10");
//		
		//int value = (int)genericClass.get(0); // manually casting the returned value to an integer.
		//int value2 = (int)genericClass.get(1); // we get ClassCastException run-time exception.
		
		// this the problem that generics came to solve.
		// we won't be aware of bugs like the one in line 11 until we run the application.
		// it would be better if we catch the error at compile-time.
	}
}
