package it.polimi.ingsw;

import it.polimi.ingsw.model.Colors;
import it.polimi.ingsw.model.Dice;
import it.polimi.ingsw.model.Draft;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DraftTest {

    private Draft draft;
    private Dice dice;

    @Before
    public void before(){
        draft = new Draft();
        dice = new Dice(Colors.G);
    }

    @Test
    public void setDraftTest(){
        draft.setDraft(dice);
        assertEquals(dice, draft.getDraft().get(0));
    }

    @Test
    public void extractTest(){
        draft.setDraft(dice);
        draft.extract(0);
        assertEquals(false, draft.getDraft().contains(dice));
    }
}