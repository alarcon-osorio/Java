package question3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

/**
 * "How do I generate random integers within a specific range in Java?"
 * 
 * @author Armin Kerscher
 */
public class Question3 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// Random ints
		for (int i = 1; i <= 50; i += 10) {
			System.out.println(String.format("Random int in range [0, %d[: %d", i, random.nextInt(i)));
		}
		// Example for an output:
		// Random int in range [0, 1[: 0
		// Random int in range [0, 11[: 4
		// Random int in range [0, 21[: 20
		// Random int in range [0, 31[: 7
		// Random int in range [0, 41[: 2
		
		// Random doubles
		for (int i = 1; i <= 50; i += 10) {
			System.out.println(String.format("Random double in range [0, %d[: %f", i, random.nextDouble() * i));
		}
		// Output:
		// Random double in range [0, 1[: 0,454714
		// Random double in range [0, 11[: 9,845851
		// Random double in range [0, 21[: 2,244591
		// Random double in range [0, 31[: 22,801551
		// Random double in range [0, 41[: 20,328762
		
		
		// Multi-threaded and ThreadLocalRandom
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(100);
		
		ArrayList<Callable<Integer>> callables = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			callables.add(() -> random.nextInt());
		}
		
		LocalTime now = LocalTime.now();
		
		try {
			newFixedThreadPool.invokeAll(callables);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ChronoUnit.MILLIS.between(now, LocalTime.now())); // e.g. 1042
		
		
		
		newFixedThreadPool = Executors.newFixedThreadPool(100);
		callables = new ArrayList<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			callables.add(() -> ThreadLocalRandom.current().nextInt());
		}
		
		now = LocalTime.now();
		
		try {
			newFixedThreadPool.invokeAll(callables);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ChronoUnit.MILLIS.between(now, LocalTime.now())); // e.g. 619
		
	}

}
