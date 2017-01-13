import org.junit.Test;

import java.io.PrintStream;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by wdsand on 1/13/17.
 */
public class GameTest {

    @Test
    public void shouldDrawRowsForBoard () {
        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(printStream);
        game.drawRows();

       verify(printStream).println("\n1|2|3\n_ _ _ \n4|5|6\n_ _ _ \n7|8|9\n_ _ _ ");

    }


}