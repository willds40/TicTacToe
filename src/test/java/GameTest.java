import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {

    private PrintStream printStream;
    private Board board;
    private Game game;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        game = new Game(printStream, board);
    }

    @Test
    public void shouldPromptPlayerforGuess(){
        game.promptUserForGuess(turn);
        verify(printStream).println("\nMake a guess");
    }

    @Test
    public void shouldCalldrawBoardMethod(){
        game.startGame();
        verify(board).drawBoard();
    }

    @Test
    public void shouldReturn2WhenPlayer1HasMadeAturn(){
        int turn = 1;
        game.keepTrackOfTurn(turn);
        assertEquals(2, game.keepTrackOfTurn(turn));

    }






}