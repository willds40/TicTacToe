import java.io.PrintStream;

/**
 * Created by wdsand on 1/13/17.
 */
public class Game {
    private PrintStream printStream;

    public Game(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void drawRows() {
            printStream.println("\n1|2|3\n_ _ _ \n4|5|6\n_ _ _ \n7|8|9\n_ _ _ ");

    }
}
