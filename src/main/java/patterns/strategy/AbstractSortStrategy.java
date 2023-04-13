package patterns.strategy;

/**
 * Abstrakte Klasse für die Sortier-Strategy, welche die Methode
 * zur Messung der Laufzeit konkret implementiert.
 *
 * @param <E> Parametrisierter Typ des Sortier-Elements.
 */
public abstract class AbstractSortStrategy<E extends Comparable<E>> implements SortStrategy<E> {
	@Override
	public abstract void sort(E[] elements);

	@Override
	public long measureRuntime(E[] elements) {
		long start = System.nanoTime();
		sort(elements);
		long stop = System.nanoTime();
		return stop - start;
	}
}
