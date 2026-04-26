package LinkedList;

public class LinkedListFeu {
    private Entry header = new Entry(null, null, null);
    private int size;

    /* Constructs an empty Linked List. */
    public LinkedListFeu() {
        header.next = header;
        header.previous = header;
    }

    /* Returns the last Element in this List. */
    public Person getLast() {
        if (size == 0)
            throw new java.util.NoSuchElementException();
        return header.previous.element;
    }

    /* Removes and returns the last Element from this List. */
    public Person removeLast() {
        Entry lastEntry = header.previous;
        if (lastEntry == header)
            throw new java.util.NoSuchElementException();
        lastEntry.previous.next = lastEntry.next;
        lastEntry.next.previous = lastEntry.previous;
        size--;
        return lastEntry.element;
    }

    /* Appends the given element to the end of this List. */
    public void addLast(Person p) {
        Entry newEntry = new Entry(p, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }

    /* Returns the number of elements in this List. */
    public int size() {
        return size;
    }

    public Person getElementAt(int position) {
        if (position > size - 1)
            throw new java.util.NoSuchElementException();
        Entry current = header.next;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.element;
    }
}
