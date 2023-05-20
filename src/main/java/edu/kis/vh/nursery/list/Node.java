package edu.kis.vh.nursery.list;

/**
 * @author Michał
 * Klasa, która reprezentuje węzeł w podwójnie połączonej liście.
 */
public class Node {

    /**
     * wartość węzła
     */
    public final int value;
    /**
     * Pola przechowujące referencje do poprzedniego 'prev' i następnego 'next' węzła w liście. 
     */
    public Node prev, next;

    /**
     * Konstruktor, który jest używany do tworzenia obiektów typu 'Node'.
     * @param i argument, który jest przypisywany do pola 'value'.
     */
    public Node(int i) {
        value = i;
    }

}
