package LinkedList;

public class Entry {
    Person element;
    Entry next;
    Entry previous;

    public Entry(Person element, Entry next, Entry previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
