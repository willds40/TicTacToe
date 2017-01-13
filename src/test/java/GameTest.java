import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by wdsand on 1/13/17.
 */
public class GameTest {



    @Test
    public void shouldPromptPlayerforGuess(){
        PrintStream printStream = mock(PrintStream.class);
        Board board = mock(Board.class);
        Game game = new Game(printStream, board);
        game.promptUserForGuess();
        verify(printStream).println("\nMake a guess");
    }

    @Test
    public void shouldCalldrawBoardMethod(){
        Board board = mock(Board.class);
        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(printStream,board);
        game.startGame();
        verify(board).drawBoard();

    }


    @Test
    public void shouldReturnPlayer2WhenPlayer1HasMadeAturn(){
        PrintStream printStream = mock(PrintStream.class);
        Player player = mock(Player.class);
        Board board = mock(Board.class);
        int turn = 1;
        Game game = new Game(printStream, board);
        game.keepTrackOfTurn(1);
        assertEquals(2, game.keepTrackOfTurn(1));

    }






}