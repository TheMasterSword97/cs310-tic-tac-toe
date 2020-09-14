package edu.jsu.mcis;
import edu.jsu.mcis.TicTacToeModel.Result;
public class TicTacToeController {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */
// this is commit to say it's completed 
    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView();
        
    }

    public void start() {
    
        /* MAIN LOOP (repeats until game is over) */

        /* Display the board using the View's "showBoard()", then use
           "getNextMove()" to get the next move from the player.  Enter
           the move (using the Model's "makeMark()", or display an error
           using the View's "showInputError()" if the move is invalid. */

       boolean gamefin;
       do 
                { //show the board 
                    view.showBoard(model.toString());
                    //get the move from player
                    TicTacToeMove move = view.getNextMove(model.isXTurn());
                            // output error if player input wrong move 
                            if(!model.makeMark(move.getRow(), move.getCol()) )
                                     {
                                         view.showInputError();
                                     }
                            gamefin = (model.getResult() != Result.NONE );

                }
       while(!gamefin);
        
        /* After the game is over, show the final board and the winner */

        view.showBoard(model.toString());

        view.showResult(model.getResult().toString());
        
    }

}
