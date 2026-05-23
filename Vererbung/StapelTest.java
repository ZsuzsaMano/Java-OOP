package Vererbung;

public class StapelTest {
    public static void main(String[] args) {
        Stapel2 a = new Stapel2();
        System.out.println(a.isEmpty());
        a.push(12);
        System.out.println(a.peek());
        a.push(13);
        System.out.println(a.peek());
        a.push(11);
        System.out.println(a.isEmpty());

        Object rem = a.pop();
        System.out.println(rem);

    }

}
