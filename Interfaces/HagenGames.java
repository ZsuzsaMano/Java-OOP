package Interfaces;

class HagenGames implements Playable {
    public ObjectWars buyGame() {
        return new ObjectWars();
    }

    void updateGame(ObjectWars ow) {
        ow.update();
    }

    public void playGame() {
        System.out.println("Running ObjectWars");
    }
}
