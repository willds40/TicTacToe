import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by wdsand on 1/13/17.
 */
public class BoardTest {

    @Test
    public void shouldDrawRowsForBoard () {
        ArrayList <String> guessesArray = new ArrayList<String>();
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream, guessesArray);
        board.drawBoard();
        printStream.printf("\n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n", 1,2,3,4,5,6,7,8,9);
    }

    @Test
    public void shouldMakeGuessesArrayList() {
        PrintStream printStream = mock(PrintStream.class);
        ArrayList <String> guessesArray = new ArrayList<String>();
        Board board = new Board(printStream, guessesArray);
        board.createGuessesArrayList();
        verify(printStream).println("123456789");
    }

    @Test
    public  void shouldMarkSpotIfGuessIs1Postion1InArrayShouldBeX(){
        PrintStream printStream = mock(PrintStream.class);
        ArrayList <String> guessesArray = new ArrayList<String>();
        Board board = new Board(printStream,guessesArray);

        String guess = "1";
        board.markspot(guess);

        assertEquals("x",guessesArray.get(0)); ;

    }


}