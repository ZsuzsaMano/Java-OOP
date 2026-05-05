package Interfaces;

public class Test {
    public static void main(String[] args) {
        HagenGames hg = new HagenGames();

        ObjectWars game = hg.buyGame();
        hg.updateGame(game);
        game.playGame();
        // game.update();
        game.playGame();
    }
}
