import java.io.PrintStream;

/**
 * Created by wdsand on 1/13/17.
 */
public class Game {
    private PrintStream printStream;
    private Player player;

    public Game(PrintStream printStream, Player player) {
        this.printStream = printStream;
        this.player = player;
    }

    public void startGame() {
        drawBoard();
        promptUserForGuess();
    }

    public void drawBoard() {
        printStream.println("\n1|2|3\n_ _ _ \n4|5|6\n_ _ _ \n7|8|9\n_ _ _ \n");
    }

    public void promptUserForGuess() {
        printStream.println("\nMake a guess");
    }
}
