package s4;

import java.util.LinkedList;

public class FigurenListe {
    LinkedList<Figur> figurenListe;

    public void figurAnfuegen(Figur figure) {
        figurenListe.addLast(figure);
    }

    public Figur letzteFigurAuslesen() {
        return figurenListe.getLast();
    }

    public void alleAnzeigen() {
        for (Figur figure : figurenListe) {
            figure.anzeigen();
        }

    }

}
