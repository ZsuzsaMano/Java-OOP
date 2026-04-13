// Schreiben Sie eine main-Methode,welche für alle n von 1 bis 100 durch Aufruf der Klassenmethode wunder()den jeweiligen Wert von wunder(n)berechnet 
// und am Ende ausgibt,welche Zahl die meisten Schritte benötigte und wie viele das waren.

public class WunderMax {
    public static void main(String[] args) {
        int max = 0;
        int nr = 0;
        for (int i = 1; i <= 100; i++) {
            int iterations = WunderTest.wunder(i);
            if (iterations > max) {
                max = iterations;
                nr = i;
            }
        }
        System.out.println("For number " + nr + " : " + max + " iterations");
    }

}
