package s1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sortieren {
    public static void main(String[] args) {
        // Ein double-Array erzeugen, das genauso groß
        // ist wie das String-Array args
        int l = args.length;
        double[] feld = new double[l];
        // alle Zahlen, die in args als Strings
        // vorliegen, in double-Werte umwandeln
        // und in das Array feld eintragen
        for (int i = 0; i < l; i = i + 1) {
            feld[i] = Double.parseDouble(args[i]);
        }
        // Hier Programmcode zum Sortieren einfügen
        for (int j = 0; j < l - 1; j++) {
            for (int i = 0; i < l - 1; i++) {
                if (feld[i] < feld[i + 1]) {
                    double big = feld[i + 1];
                    feld[i + 1] = feld[i];
                    feld[i] = big;
                }
            }
        }
        // Hier Programmcode zur Bestimmung und
        // Ausgabe des größten Elements einfügen
        double max = feld[0];
        System.out.println(max);

        // den Inhalt des Arrays feld ausgeben
        for (int i = 0; i < args.length; i = i + 1) {
            System.out.println(i + ". " + feld[i]);
        }
    }
}
