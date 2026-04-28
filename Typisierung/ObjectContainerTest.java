package Typisierung;

import LinkedList.Person;

public class ObjectContainerTest {
    public static void main(String[] args) {
        ObjectContainer testoc = new ObjectContainer();
        Person p1 = new Person("Mini", "Max");
        testoc.store(p1);
        // Object p2 = testoc.get();
        // p2.getFirstName(); The method getFirstName() is undefined for the type Object
        // es erkennt es nicht als Typ Person, da get() returns an Object
        Person p2 = (Person) testoc.get(); // explicit Typ casting
        p2.getLastName();
    }
}
