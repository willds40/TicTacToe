import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by wdsand on 1/13/17.
 */
public class GameTest {

    @Test
    public void shouldDrawRowsForBoard () {
        PrintStream printStream = mock(PrintStream.class);
        Player player = mock(Player.class);
        Game game = new Game(printStream,player);
        game.drawBoard();
       verify(printStream).println("\n1|2|3\n_ _ _ \n4|5|6\n_ _ _ \n7|8|9\n_ _ _ \n");
    }

    @Test
    public void shouldPromptPlayerforGuess(){
        PrintStream printStream = mock(PrintStream.class);
        Player player = mock(Player.class);
        Game game = new Game(printStream,player);
        game.promptUserForGuess();
        verify(printStream).println("\nMake a guess");

    }






}