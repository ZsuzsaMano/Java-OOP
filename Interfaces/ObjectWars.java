package Interfaces;

class ObjectWars implements Playable {
    private double version = 1.0;

    public void playGame() {
        System.out.println("Running ObjectWars, Version " + version);
    }

    void update() {
        version = version + 0.1;
    }
}
