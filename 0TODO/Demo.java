// Welche Zeilen werden bei der Ausführung auf der Konsole ausgegeben? Begründen Sie ihre Antwort!

// public interface I {   in it's own file, added here for better overwview
//     void m();
// }

interface J extends I {
}

abstract class A implements I {
    abstract void n(I i);

    void n(J j) {
        System.out.println("n(J j) in A.");
    }

    public void m() {
        System.out.println("m() in A.");
    }
}

class B extends A {
    void n(I i) {
        System.out.println("n(I i) in B.");
    }

    public void m() {
        System.out.println("m() in B.");
    }
}

class C extends A implements J {
    void n(I i) {
        System.out.println("n(I i) in C.");
    }

    public void m() {
        System.out.println("m() in C.");
    }
}

public class Demo {
    public static void main(String[] args) {
        I i = new B();
        J j = new C();
        A a = new B();
        B b = new B();
        C c = new C();
        a.m(); // Aufruf#1
        i.m(); // Aufruf#2
        j.m(); // Aufruf#3
        a.n(i); // Aufruf#4
        a.n(j); // Aufruf#5
        c.n(c); // Aufruf#6
        c.n(b); // Aufruf#7
    }
}
