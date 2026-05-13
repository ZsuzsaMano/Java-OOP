package Abstract;

abstract class Tier {

    abstract int beineNr();

    abstract boolean isGefährlich();

    void druckeEigenschaften() {

        System.out.println(beineNr() + " Beine");
        System.out.println("gefährlich für Menschen: " + (isGefährlich() ? "ja" : "nein"));
    };

}
