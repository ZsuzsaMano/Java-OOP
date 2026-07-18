package s4.Tupel;

public class Main {
    public static void main(String[] args) {
        Docs d1 = new Docs();
        Docs d2 = new Docs();
        Tupel<Docs> t = new Tupel<Docs>(d1, d2);
        t.beideDrucken();

    }
}
