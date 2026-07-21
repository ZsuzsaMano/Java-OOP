package s6.Wertetausch;

class WerteTauscher extends Thread {
    private static final Object LOCK = new Object(); // static, so locks across all instances
    Foo a;
    Foo b;

    WerteTauscher(Foo a, Foo b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            int h = a.wert;
            a.wert = b.wert;
            b.wert = h;

        }
    }
}
