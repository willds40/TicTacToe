import java.io.PrintStream;

/**
 * Created by wdsand on 1/13/17.
 */
public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Game game = new Game(printStream);
        game.drawRows();
    }
}
