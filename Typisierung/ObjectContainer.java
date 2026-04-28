package Typisierung;

public class ObjectContainer {
    private Object element;

    void store(Object element) {
        this.element = element;
    }

    Object get() {
        return element;
    }
}
