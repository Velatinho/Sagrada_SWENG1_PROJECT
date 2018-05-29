package it.polimi.ingsw.model.toolcards;

import it.polimi.ingsw.model.Colors;
import it.polimi.ingsw.model.Dice;
import it.polimi.ingsw.model.Draft;
import it.polimi.ingsw.model.GameModel;
import it.polimi.ingsw.model.ToolCard;
import it.polimi.ingsw.model.Window;

import java.util.ArrayList;

public class TCRunningPliers extends ToolCard {

    public TCRunningPliers(){
        super.setIdNumber(8);
        super.setColor(Colors.R);
        super.setName("Running Pliers");
        super.setDescription("After your first turn, immediately draft a die." +
            " Skip your next turn this round.\n");
        super.setIsUsed(false);
        super.setCalls(1);
        super.setForceTurn(false);
    }

    @Override
    public boolean useToolCard(GameModel gameModel, ArrayList<Integer> input) {
        //arraylisy: in 0 indice dado draft; in 1,2 le i,j della nuova posizione
        //IN 0 (-1) PER ANNULLARE
        if (input.get(0) != -1)
            return placeDice(gameModel.getActualPlayer().getWindow(), input.get(1), input.get(2), gameModel.getField().getDraft(), input.get(0));
        else
            return false; //con questo false NON deve richiamare il metodo
    }

    private boolean placeDice(Window window, int x, int y, Draft draft, int i){ //x,y indice del piazzamento, i indice draft
        Dice dicetmp = draft.getDraft().get(i);
        if ((window.verifyAllRestrictions(dicetmp, x, y)) || (window.getIsEmpty() && window.verifyFirstDiceRestriction(dicetmp, x, y))){
            draft.extract(i);
            window.getWindow()[x][y].setDice(dicetmp);
            return true;
        }
        else
            return false;
    }

}
