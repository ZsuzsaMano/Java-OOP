package Vererbung;

public class Stapel extends ListWithInternalArray {

    // legt ein Element auf den Stapel
    public void push(Object element) {
        add(element, 0);
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return getElementAt(0);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return removeElementAt(0);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return size == 0;
    }
}