package me.boukadi.bestpricefinder;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		
		List<CompletableFuture<Void>> futures = FlightService.getQuotes()
			// execute all the mapped futures in the list of CompletableFutures
			.map(future -> future.thenAccept(quote -> System.out.println(quote)))
			.collect(Collectors.toList());
		
		CompletableFuture
			.allOf(futures.toArray(new CompletableFuture[0]))
			.thenRun(() -> {
				LocalTime end = LocalTime.now();
				Duration duration = Duration.between(start, end);
				System.out.println("retrieved all quotes in " + duration.toMillis() + "ms");
			});
		
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
