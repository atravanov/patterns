# Projekt: Design Patterns
## Übersicht
Folgende Design-Patterns werden im Rahmen dieser Lerneinheit behandelt:
* Abstract Factory
* Adapter
* Strategy

## Literatur
* Design Patterns, Elements of Reusable Object-Oriented Software, Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, ADDISON-WESLEY PROFESSIONAL COMPUTING SERIES
## Was sind Design Patterns ?
„Jedes Pattern beschreibt ein Problem, welches immer wieder vorkommt und dann
beschreibt es den Kern der Lösung des Problems, so dass Du diese Lösung eine
Million Mal verwenden kannst, ohne dass Du zweimal dasselbe machst.“
(Christopher Alexander über Patterns bei Gebäuden und Städten)

![NY](skyscr.PNG)
## Klassifikation von Design Patterns
![Klassifikation](classification.PNG)

## Design Pattern: Strategy
Das Strategy Design Pattern ist ein Entwurfsmuster, das es ermöglicht, Algorithmen in austauschbare Module zu unterteilen, die dynamisch ausgetauscht werden können, je nachdem welche Strategie zu einem bestimmten Zeitpunkt benötigt wird. Folgendes Klassendiagramm beschreibt das Pattern:

![NY](state-pattern.drawio.PNG)

Ziel der folgenden Aufgaben ist es, das Strategy Design Pattern zu verwenden, um verschiedene Sortier-Algorithmen zu implementieren. Die Implementierung soll es ermöglichen, dass der Algorithmus zur Sortierung zur Laufzeit ausgetauscht werden kann, ohne dass der Rest des Codes davon betroffen ist. 


Die folgenden Schritte sind zu implementieren:

* **Aufgabe 1:** Implementieren Sie das Interface *SortStrategy*, das die Methoden *sort* und *measureRuntime* definiert. Die Methode *measureRuntime* retourniert die Dauer einer konkreten Sortierung  in Nano-Sekunden. Sie sind frei in der Wahl der Input-Parameter. Versuchen sie diese möglichst flexibel zu halten. Dokumentieren Sie das implementierte Interface mit Javadoc.

* **Aufgabe 2:** Implementieren Sie die Abstrakte Klasse *AbstractSortStrategy*, welche das Interface *SortStrategy* realisiert, jedoch nur die Methode *measureRuntime* implementiert.

* **Aufgabe 3:** Erstellen Sie eine konkrete Klasse, welche die Sortierstrategie BubbleSort implementiert. 
Siehe dazu das Kapitel *BubbleSort* im Anhang.

* Dazu gehören zum Beispiel "BubbleSort", "QuickSort" und "MergeSort".

* Erstellen Sie eine Klasse "Sortierer", die eine Instanz der abstrakten Klasse oder des Interfaces "Sortierstrategie" enthält. Diese Klasse soll eine Methode "sortieren" enthalten, die das Sortieren der Daten mit der aktuellen Sortierstrategie durchführt.

* Schreiben Sie eine Klasse "Client", die die Daten bereitstellt und die Sortierung durchführt. Hier soll die gewünschte Sortierstrategie ausgewählt werden können.

* Testen Sie die Implementierung, indem Sie verschiedene Sortierstrategien auswählen und die Ergebnisse vergleichen.

* Dokumentieren Sie Ihre Implementierung ausführlich und erstellen Sie ein Klassendiagramm, um die Beziehungen zwischen den Klassen zu zeigen.

* Optional können Sie die Implementierung um weitere Sortieralgorithmen erweitern und die Leistung der verschiedenen Algorithmen vergleichen.

Viel Erfolg bei der Implementierung!

# Anhang
## BubbleSort
Das BubbleSort-Verfahren ist ein einfacher Sortieralgorithmus, der Elemente einer Liste durch Vergleich und Vertauschung miteinander sortiert. Der Algorithmus arbeitet, indem er benachbarte Elemente in der Liste vergleicht und sie vertauscht, wenn sie in der falschen Reihenfolge sind. Dieser Vorgang wird solange wiederholt, bis die Liste vollständig sortiert ist.

Bubble-Sort besteht aus folgenden Schritten:

1. Durchlaufe die Liste von links nach rechts.
Vergleiche jedes benachbarte Element miteinander. Wenn das linke Element größer als das rechte Element ist, tausche sie.

2. Wiederhole diesen Vorgang bis zum Ende der Liste.
Beginne erneut am Anfang der Liste, ignoriere aber die bereits sortierten Elemente am rechten Ende der Liste.

