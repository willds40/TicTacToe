import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;


public class Board {
    private PrintStream printStream;
   private ArrayList<String>guessesArray;


    public Board(PrintStream printStream, ArrayList<String> guessesArray) {
        this.printStream = printStream;
        this.guessesArray = guessesArray;
        createGuessesArrayList();
    }

    public void drawBoard() {
        printStream.printf("\n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n%s|%s|%s\n_ _ _ \n",guessesArray.get(0),guessesArray.get(1),guessesArray.get(2),guessesArray.get(3),guessesArray.get(4),guessesArray.get(5),guessesArray.get(6),guessesArray.get(7),guessesArray.get(8));
    }

    public void createGuessesArrayList() {
        guessesArray = new ArrayList<String>();
        guessesArray.addAll(Arrays.asList("1", "2", "3", "4", "5","6", "7" ,
                "8", "9"));
        String string = "";
        for (String position : guessesArray) {
          string += position;
        }
        //printStream.println(string);
    }

    public void markspot(String guess, int turn) {
      int indexOfObjectToReplace =  guessesArray.indexOf(guess);
        if (turn ==1) {
            guessesArray.set(indexOfObjectToReplace, "x");
        }else{
            guessesArray.set(indexOfObjectToReplace, "o");
        }
    }

    public String checkForHorizontalWin(int turn) {
        String player ="";
        if (turn == 1) {
            player = "x";
            }else {
             player ="o";
        }
        if (guessesArray.get(0) == player && guessesArray.get(1)
                == player && guessesArray.get(2) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }
        if (guessesArray.get(3) == player && guessesArray.get(4)
                == player && guessesArray.get(5) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }
        if (guessesArray.get(6) == player && guessesArray.get(7)
                == player && guessesArray.get(8) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }

        if (guessesArray.get(0) == player && guessesArray.get(3)
                == player && guessesArray.get(6) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }
        if (guessesArray.get(1) == player && guessesArray.get(4)
                == player && guessesArray.get(7) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }
        if (guessesArray.get(2) == player && guessesArray.get(5)
                == player && guessesArray.get(8) == player) {
            printStream.printf("Player %d Wins", turn);
            return "win";
        }

        if (guessesArray.get(0) == player && guessesArray.get(4)
                == player &&guessesArray.get(8) == player){
            printStream.printf("Player %d Wins", turn);
            return "win";
        }
        if (guessesArray.get(2) == player && guessesArray.get(4)
                == player &&guessesArray.get(6) == player){
            printStream.printf("Player %d Wins",turn);
            return "win";
        }
    return "keep playing";
    }
}
