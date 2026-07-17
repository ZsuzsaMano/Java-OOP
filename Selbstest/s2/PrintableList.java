package s2;

public class PrintableList {
    private Entry header = new Entry(null, null, null);
    private int size;

    private static class Entry {
        Printable element;
        Entry next;
        Entry previous;

        public Entry(Printable element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

    /* Constructs an empty Linked List. */
    public PrintableList() {
        header.next = header;
        header.previous = header;
    }

    public class ListIterator {
        private int nextIndex;
        private Entry next = header.next;

        public boolean hasNext() {
            return nextIndex != size;
        }

        public Printable next() {
            if (nextIndex == size)
                throw new java.util.NoSuchElementException();
            Printable elem = next.element;
            next = next.next;
            nextIndex++;
            return elem;
        }
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    /* Returns the last Element in this List. */
    public Printable getLast() {
        if (size == 0)
            throw new java.util.NoSuchElementException();
        return header.previous.element;
    }

    /* Removes and returns the last Element from this List. */
    public Printable removeLast() {
        Entry lastEntry = header.previous;
        if (lastEntry == header)
            throw new java.util.NoSuchElementException();
        lastEntry.previous.next = lastEntry.next;
        lastEntry.next.previous = lastEntry.previous;
        size--;
        return lastEntry.element;
    }

    /* Appends the given element to the end of this List. */
    public void addLast(Printable p) {
        Entry newEntry = new Entry(p, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }

    /* Returns the number of elements in this List. */
    public int size() {
        return size;
    }

    public Printable getElementAt(int position) {
        if (position > size - 1)
            throw new java.util.NoSuchElementException();
        Entry current = header.next;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.element;
    }
}
