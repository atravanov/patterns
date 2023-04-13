package patterns.strategy;

/**
 * Schnittstellenbeschreibung der Methoden für die Sortier-Strategy.
 * Neben der eigentlichen Sortier-Methode wird noch eine zusätzliche
 * Methode für die Laufzeit-Messung des Sortierverfahrens angeboten.
 *
 * @param <E> Parametrisierter Typ  für die zu sortierenden Elemente.
 */
public interface SortStrategy <E extends Comparable<E>> {
	/**
	 * Sortiert einen Array von Elementen aufsteigend.
	 * @param elements Elemente, welche sortiert werden.
	 */
	void sort(E[] elements);
	/**
	 * Misst die Laufzeit für die Sortierung der Elemente-
	 * @param elements Elemente, welche sortiert werden.
	 * @return Laufzeit in Nanosekunden.
	 */
	long measureRuntime(E[] elements);
}
