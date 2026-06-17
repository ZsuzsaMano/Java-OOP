package Callback;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] arg) {
        ArrayList<Person> source = new ArrayList<Person>();
        source.add(new Person("Joe", 77.0));
        source.add(new Person("Bob", 90.2));
        source.add(new Person("Jenny", 44.2));
        source.add(new Person("Anna", 51.9));
        source.add(new Person("Peter", 84.3));

        Filter<Person> personFilter = new Filter<Person>(source);
        FilterPredicate<Person> hasShortName = new PredicateShortName();
        List<Person> resultS = personFilter.filter(hasShortName);
        System.out.println("Filtered by name (<5 char):");

        for (Person person : resultS) {
            System.out.println(person.getName());
        }
        FilterPredicate<Person> isLightWeght = new PredicateLightWeight();
        List<Person> resultW = personFilter.filter(isLightWeght);
        System.out.println("Filtered by weight (<60kg):");
        for (Person p : resultW) {
            System.out.println(p.getName());
        }

    };

}
