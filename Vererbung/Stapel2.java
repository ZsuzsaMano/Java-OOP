package Vererbung;

public class Stapel2 {
    ListWithInternalArray internalList = new ListWithInternalArray();

    // legt ein Element auf den Stapel
    public void push(Object element) {
        internalList.add(element, 0);
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return internalList.getElementAt(0);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return internalList.removeElementAt(0);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return internalList.size == 0;
    }
}