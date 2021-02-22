package me.boukadi.bestpricefinder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import me.boukadi.executer.LongTask;

public class FlightService {
	
	public static Stream<CompletableFuture<Quote>> getQuotes() {
		List<String> sites = Arrays.asList("site1", "site2", "site3");
		// map each site to a future
		return sites.stream()
			.map(site -> getQuote(site));
	}
	
	public static CompletableFuture<Quote> getQuote(String site) {
		System.out.println("getting the quote from " + site);
		return CompletableFuture.supplyAsync(() ->  {
			Random random = new Random();
			int delay = 1000 + random.nextInt(2000);
			
			LongTask.simulate(delay);
			int price = random.nextInt(10);
			return new Quote(site, 100 + price);
		});
	}
}
