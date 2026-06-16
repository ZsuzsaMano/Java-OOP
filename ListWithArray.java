
import java.util.NoSuchElementException;

public class ListWithArray<ET> {
    private Object[] arr;
    int size;
    int capacity;

    public ListWithArray(int length) {
        arr = new Object[length];
        size = length;
        capacity = length;
    }

    void addLast(ET element) {
        Object[] arr2;
        if (size == capacity) {
            arr2 = new Object[capacity * 2];
            for (int i = 0; i < size; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            capacity = capacity * 2;
        }
        arr[size] = element;
        size++;

    }

    ET getLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return (ET) arr[size - 1];

    }

    ET removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        size--;
        ET last = (ET) arr[size];
        arr[size] = null;
        return last;
    }

    int size() {
        return size;
    }

}
