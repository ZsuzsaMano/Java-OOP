package LinkedList;

public class LinkedListFeuTest {
    public static void main(String[] args) {
        Person p1 = new Person("Mad", "Max");
        Person p2 = new Person("Kill", "Bill");
        Person p3 = new Person("Edit ", "Piaf");
        LinkedListFeu list = new LinkedListFeu();
        list.addLast(p1);
        list.addLast(p2);
        list.addLast(p3);
        Person pWho = list.getElementAt(2);
        System.out.println(pWho == p3);

    }
}
