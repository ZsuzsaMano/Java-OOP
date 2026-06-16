package Callback;

public class PredicateShortName implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getName().length() < 5;
    }

}
