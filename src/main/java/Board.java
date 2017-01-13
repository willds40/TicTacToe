import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by wdsand on 1/13/17.
 */
public class Board {
    private PrintStream printStream;
   private ArrayList<String>guessesArray;


    public Board(PrintStream printStream, ArrayList<String> guessesArray) {
        this.printStream = printStream;
        this.guessesArray = guessesArray;
    }

    public void drawBoard() {
        createGuessesArrayList();
        printStream.printf("\n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n",guessesArray.get(0),guessesArray.get(1),guessesArray.get(2),guessesArray.get(3),guessesArray.get(4),guessesArray.get(5),guessesArray.get(6),guessesArray.get(7),guessesArray.get(8));
    }

    public void createGuessesArrayList() {
        guessesArray = new ArrayList<String>();
        guessesArray.add("1");
        guessesArray.add("2");
        guessesArray.add("3");
        guessesArray.add("4");
        guessesArray.add("5");
        guessesArray.add("6");
        guessesArray.add("7");
        guessesArray.add("8");
        guessesArray.add("9");
        String string = "";
        for (String position : guessesArray) {
          string += position;

        }
        printStream.println(string);
    }


    public void markspot(String guess) {


    }
}
