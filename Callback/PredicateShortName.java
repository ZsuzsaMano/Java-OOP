package Callback;

import LinkedList.Person;

public class PredicateShortName implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getFirstName().length() < 5;
    }

}
