import java.io.PrintStream;

/**
 * Created by wdsand on 1/13/17.
 */
public class Game {
    private PrintStream printStream;
    private int turn = 1;
    private Board board;

    public Game(PrintStream printStream, Board board) {
        this.printStream = printStream;
        this.board = board;
    }

    public void startGame() {
        Player player1 = new Player();
        Player player2 = new Player();
        turn = 1;
        board.drawBoard();
        promptUserForGuess();
    }


    public void promptUserForGuess() {

        printStream.println("\nMake a guess");
    }

    public int keepTrackOfTurn(int turn) {
        if (turn == 1){
            turn =2;
        }else{
           turn = 1;
        }
        return turn;
    }


}
