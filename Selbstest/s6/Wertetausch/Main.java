package s6.Wertetausch;

public class Main {
    public static void main(String[] argv) throws InterruptedException {
        Foo x = new Foo(0);
        Foo y = new Foo(1);
        System.out.println("x: " + x.wert + " y: " + y.wert);
        WerteTauscher tom = new WerteTauscher(x, y);
        WerteTauscher jerry = new WerteTauscher(y, x);
        tom.start();
        jerry.start();
        tom.join();
        jerry.join();
        System.out.println("x: " + x.wert + " y: " + y.wert);
    }
}
