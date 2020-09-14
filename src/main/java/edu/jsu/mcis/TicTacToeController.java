package edu.jsu.mcis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */

    public TicTacToeController(final int width) 
        {

            /* Initialize model, view, and width */

            model = new TicTacToeModel(width);
            view = new TicTacToeView(this, width);

        }
    
    public String getMarkAsString(int row,int col)
        {
         return (model.getMark(row,col).toString());   
        }
    public TicTacToeView getView()
    {
     return view;    
    }
    
   @Override
   public void actionPerformed(ActionEvent action)
   {
       String act = action.toString();
       act = act.substring (act.length() - 2);
       int inp = Integer.parseInt(act);
       int j = inp/10;
       int k = inp%10;
       model.makeMark(j,k);
       view.updateSquares();
       if(!model.getResult().equals(TicTacToeModel.Result.NONE))
       {
           view.showResult(model.getResult().toString());
           view.disableSquares();
       }
   }

}
