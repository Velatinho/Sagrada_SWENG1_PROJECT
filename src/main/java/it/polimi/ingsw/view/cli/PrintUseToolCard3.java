package it.polimi.ingsw.view.cli;

import it.polimi.ingsw.model.GameModel;
import it.polimi.ingsw.model.ToolCard;
import it.polimi.ingsw.view.RemoteView;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintUseToolCard3 implements Serializable {

    private static final String STOP = "ENTER [-1] TO STOP. WARNING: THE CARD WILL BE SET AS USED";

    /**
     * prints some messages to ask the client to select the positions where he would like to place the die
     * @param gameModel the gamemodel of the match
     * @param toolCard the list of 3 toolcards of the match
     * @param choices the list of integer that contains the client's inputs
     */
    public static void print(GameModel gameModel, ToolCard toolCard, ArrayList<Integer> choices, RemoteView view) throws RemoteException {
        if (toolCard.getNumber() == 11){    //FLUX REMOVER
            try {
                choices.remove(2);
                choices.remove(2);
            } catch (IndexOutOfBoundsException e){
                //DO NOTHING
            }
            PrintWindow.print(gameModel.getActualPlayer().getWindow());
            System.out.println("SELECT THE ROW TO INSERT THE DIE");
            System.out.println(STOP);
            if (!askInput(2, choices, view))
                return;
            System.out.println("SELECT THE COLUMN TO INSERT THE DIE");
            askInput(3, choices, view);
        }
    }

    private static boolean askInput(int i, ArrayList<Integer> choices, RemoteView view) throws RemoteException{
        Scanner input;
        int tmp;
        do {
            input = new Scanner(System.in);
            while (!input.hasNextInt())
                input = new Scanner(System.in);
            tmp = input.nextInt();
            if (!view.getOnline())
                return false;
            if (tmp == -1) {
                choices.add(0, tmp);
                return false;
            }
        }while(!correctInput(tmp, i));
        choices.add(tmp-1);
        return true;
    }

    /**
     * verify if the client's input is correct
     * @param i the client's input
     * @param check a value to know what's the bounds of input
     * @return true if the input is correct, false otherwise
     */
    private static boolean correctInput(int i, int check){
        if (check == 2){            //check row
            return checkInput(i, 5);
        }
        else if (check == 3){       //check column
            return checkInput(i, 6);
        }
        return false;               //method error
    }

    /**
     * verifies if the input is correct or not
     * @param i the client's input
     * @param j the maximum input accepted
     * @return true if the input is correct, false otherwise
     */
    private static boolean checkInput(int i, int j){
        if(!(i > 0 && i < j))
            return error();
        else
            return true;
    }

    /**
     * prints a error message
     * @return false
     */
    private static boolean error(){
        System.out.println("Input error! Do it again correctly");
        return false;
    }
}
