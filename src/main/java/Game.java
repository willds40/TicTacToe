import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by wdsand on 1/13/17.
 */
public class Game {
    private PrintStream printStream;
    private int turn;
    private Board board;
    private String guess;

    public Game(PrintStream printStream, Board board) {
        this.printStream = printStream;
        this.board = board;
    }

    public void startGame() throws IOException {
        turn = 1;
        board.drawBoard();
        playGame();

    }
    public void playGame() throws IOException {
        promptUserForGuess(turn);
        board.markspot(guess,turn);
        board.drawBoard();
        String status = board.checkForHorizontalWin(turn);
        if (status.equals("keep playing")){
           turn = keepTrackOfTurn(turn);
            playGame();
        }
    }


    public String promptUserForGuess(int turn) throws IOException {
        String player = "";
        if (turn ==1){
            player = "Player 1";
        }
        if (turn == 2){
            player = "Player 2";
        }
        printStream.printf("\n %s Pick A Number To Select Position\n",player);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        guess = br.readLine();

        return guess;
    }

    public int keepTrackOfTurn(int turn) {
        if (turn == 1){
           return 2;
        }
        return 1;
    }


}
