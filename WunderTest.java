
// Eine Ausgangszahl wird, falls sie gerade ist, durch 2 dividiert. Wenn sie hingegen ungerade ist, wird sie mit 3 multipliziert und dann 1 addiert. 
// Dieses wird wiederholt, bis das Ergebnis 1 ist. 

public class WunderTest {
    public static int wunder(int nr) {
        if (nr < 1) {
            throw new IllegalArgumentException("this is not a Natürliche Zahl");
        }
        int i = 0;
        while (nr != 1) {
            if (nr % 2 == 0) {
                nr = nr / 2;
                i++;
            } else {
                nr = nr * 3 + 1;
                i++;
            }
        }
        return i;
    }

    public static int wunderRec(int nr, int i) {
        if (nr < 1) {
            throw new IllegalArgumentException("this is not a Natürliche Zahl");
        }
        if (nr == 1) {
            return i;
        } else {
            if (nr % 2 == 0) {
                nr = nr / 2;
                i++;
                return wunderRec(nr, i);
            } else {
                nr = nr * 3 + 1;
                i++;
                return wunderRec(nr, i);
            }
        }
    }
}
