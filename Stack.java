class Stack {
    private int size;
    Entry header = new Entry(null, null);

    public Stack() {
        this.header.next = null;
    }

    private class Entry {
        Entry next;
        StringWrapper element;

        Entry(String element, Entry next) {
            this.next = next;
            this.element = new StringWrapper(element);
        }
    }

    class StringWrapper {
        String str;

        StringWrapper(String str) {
            this.str = str;
        }

        String StringValue() {
            return str;
        }

        public String toString() {
            return str;
        }
    }

    public void push(String element) {
        Entry top = new Entry(element, header.next);
        this.header.next = top;
        size++;
    }

    public StringWrapper peek() {
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        return this.header.next.element;
    }

    public StringWrapper pop() {
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        StringWrapper top = this.header.next.element;
        this.header.next = this.header.next.next;
        size--;
        return top;
    }

    public void isEmpty() {
        String empty = size == 0 ? "is" : "is not";
        System.out.println("This stack " + empty + " empty");
    }

}
