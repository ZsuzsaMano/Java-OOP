import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListAddressBook<T> {
    private ArrayList<T> arr = new ArrayList<T>();

    public ArrayListAddressBook() {
    }

    void addLast(T element) {
        arr.add(arr.size(), element);
    }

    T getLast() {
        if (arr.size() == 0) {
            throw new NoSuchElementException();
        }
        return arr.get(arr.size() - 1);

    }

    T removelLast() {
        if (arr.size() == 0) {
            throw new NoSuchElementException();
        }
        return arr.remove(arr.size() - 1);
    }

    int size() {
        return arr.size();
    }

}
