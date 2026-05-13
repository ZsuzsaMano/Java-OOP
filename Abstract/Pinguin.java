package Abstract;

public class Pinguin extends Tier {
    @Override
    int beineNr() {
        return 2;
    }

    @Override
    boolean isGefährlich() {
        return false;
    }
}
