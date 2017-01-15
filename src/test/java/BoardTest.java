import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    private ArrayList<String> guessesArray;
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        guessesArray = new ArrayList<String>();
        printStream = mock(PrintStream.class);
        board = new Board(printStream, guessesArray);
    }

    @Test
    public void shouldDrawRowsForBoard () {
        board.drawBoard();
        printStream.printf("\n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n", 1,2,3,4,5,6,7,8,9);
    }

    @Test
    public void shouldMakeGuessesArrayList() {
        board.createGuessesArrayList();
        verify(printStream).println("123456789");
    }

    @Test
    public  void shouldMarkSpotIfGuessIs1Postion1InArrayShouldBeX(){
        guessesArray.add("1");
        String guess = "1";
        int turn = 1;
        board.markspot(guess, turn);
        assertEquals("x",guessesArray.get(0)); ;
    }

    @Test
    public void shouldTurnEqualsTwoDraw0(){
        guessesArray.add("1");
        String guess = "1";
        int turn = 2;
        board.markspot(guess,turn);
        assertEquals("o",guessesArray.get(0)); ;
    }

    @Test
    public void shouldCheckToSeeIfWonHorizontal(){
        int turn = 1;
        guessesArray.add("x");
        guessesArray.add ("x");
        guessesArray.add("x");
        board.checkForHorizontalWin (1);

        verify(printStream).printf("Player %d Wins", turn);

        }

    @Test
    public void shouldCheckToSeeIfWonVertical(){
        int turn = 1;
        guessesArray.add("x");
        guessesArray.add ("o");
        guessesArray.add("o");
        guessesArray.add("x");
        guessesArray.add ("o");
        guessesArray.add("o");
        guessesArray.add("x");
        guessesArray.add ("o");
        guessesArray.add("o");

        board.checkForVerticalWin( 1);

        verify(printStream).printf("Player %d Wins", turn);
    }
    @Test
    public void shouldCheckToSeeIfWonDiagnol(){
        int turn = 1;
        guessesArray.add("x");
        guessesArray.add ("o");
        guessesArray.add("o");
        guessesArray.add("o");
        guessesArray.add ("x");
        guessesArray.add("o");
        guessesArray.add("o");
        guessesArray.add ("o");
        guessesArray.add("x");

        board.checkForDiagonalWin( 1);

        verify(printStream).printf("Player %d Wins", turn);
    }

}