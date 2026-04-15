// Das Spiel Game of Life ist ein Ende der 60er Jahre vom Mathematiker John Horton Conway erstmalig vorgeschlagener und detailliert untersuchter
//  zellulärer Automat.Gegeben ist dabei ein rechteckiges Feld mit n Zeilen und m Spalten,dessen Komponenten Zellen genannt werden.Jede Zelle kann zwei 
// Zustände annehmen:lebend oder tot.Die zu Beginn lebenden Zellen bilden die Anfangsgeneration.Eine Folgegeneration entsteht nach folgenden Regeln:

// Eine lebende Zelle lebt auch in der Folgegeneration,wenn genau zwei oder drei der acht benachbarten Zellen in der aktuellen Generation leben.

// Eine lebende Zelle stirbt in der Folgegeneration an Einsamkeit oder Überbevölkerung,wenn in der aktuellen Generation weniger als zwei oder mehr als drei der acht Nachbarzellen leben.

// Eine tote Zelle wird in der Folgegeneration lebendig,wenn genau drei ihrer acht Nachbarn in der aktuellen Generation lebendig sind.

// Unabhängig von den obigen drei Regeln sind die Randzellen(also diejenigen Zellen,die nicht genau acht Nachbarn haben)immer tot.

public class GameOfLife {
    boolean[][] feld = {
            { false, false, false, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, false, false, false } };

    void print() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j]) {
                    System.out.print("o ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    void nextGeneration() {

        boolean[][] nextGenerationM = new boolean[feld.length][feld[0].length];
        for (int i = 1; i < feld.length - 1; i++) {
            for (int j = 1; j < feld.length - 1; j++) {
                int nrOfLiveNeighbours = 0;
                if (feld[i - 1][j - 1]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i - 1][j]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i - 1][j + 1]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i][j - 1]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i][j + 1]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i + 1][j - 1]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i + 1][j]) {
                    nrOfLiveNeighbours++;
                }
                if (feld[i + 1][j + 1]) {
                    nrOfLiveNeighbours++;
                }

                switch (nrOfLiveNeighbours) {
                    case 3:
                        nextGenerationM[i][j] = true; // lebt
                        break;
                    case 2:
                        nextGenerationM[i][j] = feld[i][j]; // if dead stays dead, if alive keeps living
                        break;
                    default:
                        nextGenerationM[i][j] = false; // stirbt an Einsamkeit oder Überbevölkerung
                        break;
                }
            }
        }
        feld = nextGenerationM;

    }

    public static void main(String[] args) {
        GameOfLife myGame = new GameOfLife();
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
        }
    }

}
