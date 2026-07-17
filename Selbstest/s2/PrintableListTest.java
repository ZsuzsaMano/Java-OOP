package s2;

public class PrintableListTest {
    public static void main(String[] args) {
        PrintableList plist = new PrintableList();
        Person p1 = new Person("Otto");
        Person p2 = new Person("Edit");
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Book b = new Book("Momo");

        plist.addLast(p1);
        plist.addLast(c1);
        plist.addLast(c2);
        plist.addLast(c3);
        plist.addLast(b);
        plist.addLast(p2);

        PrintableList.ListIterator li = plist.listIterator();
        while (li.hasNext()) {
            Printable elem = li.next();
            elem.print();
        }
    }
}
