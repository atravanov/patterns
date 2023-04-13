package patterns.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Kunden Klasse, welche verschiedene Sortier-Strategien und Laufzeitberechnungen
 * durchführt.
 */
public class SortClient {
	private static final Random rnd;
	
	static {
		rnd = new Random();
	}
	
	/**
	 * Entrypoint Methode für die Durchführung der verschiedenen Sortierverfahren und
	 * Laufzeitberechnungen.
	 * @param args Argumente werden nicht verwendet.
	 */
	public static void main(String[] args) {
		SortStrategy<Integer> strategy = new BubbleSortStrategy<Integer>();
		Integer[] elements = generateRandomNumbers(10,1000);
		Integer[] elements1 = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(elements1));
		long nanos = strategy.measureRuntime(elements1);
		//System.out.println(Arrays.toString(elements1));
		System.out.println(nanos);
	}
	
	private static Integer[] generateRandomNumbers(int nof, int max) {
		Integer[] elements = new Integer[nof];
		for(int i=0;i<nof;i++) {
			elements[i] = rnd.nextInt(0,max+1);
		}
		return elements;
	}
}
