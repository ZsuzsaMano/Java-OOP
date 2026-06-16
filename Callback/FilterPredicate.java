package Callback;

public interface FilterPredicate<T> {
    boolean isMatching(T candidate);

}
