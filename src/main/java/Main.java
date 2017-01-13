import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by wdsand on 1/13/17.
 */
public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        ArrayList<String> guessesArray = new ArrayList<String>();
        Board board = new Board(printStream, guessesArray);
        Game game = new Game(printStream, board);
        game.startGame();
    }
}
