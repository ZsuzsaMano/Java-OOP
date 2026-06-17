package Callback;

public class PredicateLightWeight implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getWeight() < 60;
    }

}
