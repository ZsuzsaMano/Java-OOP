
// Eine Ausgangszahl wird, falls sie gerade ist, durch 2 dividiert. Wenn sie hingegen ungerade ist, wird sie mit 3 multipliziert und dann 1 addiert. 
// Dieses wird wiederholt, bis das Ergebnis 1 ist. 

public class Wunder {
    public static int iter(int nr) {
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

}
