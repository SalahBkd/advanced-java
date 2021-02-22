package me.boukadi.bestpricefinder;

public class Quote {
	
	private final String name;
	private final int price;
	
	public Quote(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Quote [name=" + name + ", price=" + price + "]";
	}
	
	
}
