package LinkedList;

public class Person {
    private String name;

    public Person(String firstName, String lastName) {
        name = firstName + "," + lastName;
    }

    public String getFirstName() {
        int index = name.indexOf(',');
        return name.substring(0, index);
    }

    public String getLastName() {
        int index = name.indexOf(',');
        return name.substring(index + 1);
    }
}
