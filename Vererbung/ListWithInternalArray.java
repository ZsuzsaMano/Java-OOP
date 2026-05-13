package Vererbung;

public class ListWithInternalArray {
    int size;

    private Object[] objs = new Object[1];

    // Fügt das übergebene Element an der angegebenen Position ein.
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) {
        size++;
        Object[] objs2 = new Object[size];
        for (int i = 0; i < index; i++) {
            objs2[i] = objs[i];
        }
        objs2[index] = elem;
        for (int i = index + 1; i < size; i++) {
            objs2[i] = objs[i - 1];
        }
        objs = objs2;

    }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index doesn't exist");
        }

        return objs[index];
    }

    // Liefert eine Referenz auf das Element an der angegebenen Position und
    // entfernt es
    // gleichzeitig aus der Liste. Nachfolgende Elemente werden ggf. nach vorne
    // verschoben.
    public Object removeElementAt(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index doesn't exist");
        }
        size--;
        Object element = objs[index];
        Object[] objs2 = new Object[size];
        for (int i = 0; i < index; i++) {
            objs2[i] = objs[i];
        }
        for (int i = index; i < size; i++) {
            objs2[i] = objs[i + i];
        }
        objs = objs2;
        return element;
    }

    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() {
        return size;
    }
}
