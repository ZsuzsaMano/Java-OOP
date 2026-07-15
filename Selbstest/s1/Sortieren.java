package s1;

import java.util.Arrays;

public class Sortieren {
    public static void main(String[] args) {
        // Ein double-Array erzeugen, das genauso groß
        // ist wie das String-Array args
        double[] feld = new double[args.length];
        // alle Zahlen, die in args als Strings
        // vorliegen, in double-Werte umwandeln
        // und in das Array feld eintragen
        for (int i = 0; i < args.length; i = i + 1) {
            feld[i] = Double.parseDouble(args[i]);
        }
        // Hier Programmcode zum Sortieren einfügen
        Arrays.sort(feld);
        // Hier Programmcode zur Bestimmung und
        // Ausgabe des größten Elements einfügen
        double max = feld[args.length - 1];
        System.out.println(max);

        // den Inhalt des Arrays feld ausgeben
        for (int i = 0; i < args.length; i = i + 1) {
            System.out.println(i + ". " + feld[i]);
        }
    }
}
