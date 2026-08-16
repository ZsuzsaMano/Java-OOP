import java.util.ArrayList;
import java.util.List;

// Teilaufgabe a)

// Welche der acht Methodenaufrufe A1-A8 führen zu einem Compilerfehler?Beschreiben Sie jeweils die Ursache des Fehlers.

// Teilaufgabe b)Wenn Sie die Aufrufe löschen,welche zu Compilerfehlern führen:Wie lautet dann die Ausgabe des Programms.
// Begründen Sie für jeden der verbleibenden Aufrufe,warum er zu welcher Ausgabe führt.

public class Aufloesung {
    public static void main(String[] args) {
        Super s1 = new Sub();
        Sub s2 = new Sub();
        List<Kuh> kuhList = new ArrayList<Kuh>();
        List<Tier> tierList = null;
        Tier[] tierArray = new Kuh[2];
        Kuh[] kuhArray = new Kuh[5];
        s1.m(tierArray, tierList); // Aufruf 1
        // s1.m(kuhArray, kuhList); // Aufruf 2 (compiler fehler)
        // s1.m(tierArray, kuhList); // Aufruf 3 (compiler fehler)
        s1.m(kuhArray, tierList); // Aufruf 4
        s2.m(tierArray, tierList); // Aufruf 5
        s2.m(kuhArray, kuhList); // Aufruf 6
        s2.m(tierArray, kuhList); // Aufruf 7
        // s2.m(kuhArray, tierList); // Aufruf 8 (compiler fehler)
    }
}

class Super {
    void m(Tier[] p1, List<Tier> p2) {
        System.out.println("M1");
    }
}

class Sub extends Super {
    void m(Lebewesen[] p1, List<?> p2) {
        System.out.println("M2");
    }

    void m(Tier[] p1, ArrayList<Kuh> p2) {
        System.out.println("M3");
    }

    void m(Kuh[] p1, List<?> p2) {
        System.out.println("M4");
    }
}

class Lebewesen {
}

class Tier extends Lebewesen {
}

class Kuh extends Tier {
}
