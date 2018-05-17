package it.polimi.ingsw.view.cli;

import it.polimi.ingsw.model.PrivateObjective;

import java.io.Serializable;

public class PrintPrivateObjective implements Serializable {

    public static void print(PrivateObjective privateObjective){
        System.out.println("TITLE: "+ privateObjective.getName());
        System.out.println("DESCRIPTION: "+ privateObjective.getDescription());
    }
}
