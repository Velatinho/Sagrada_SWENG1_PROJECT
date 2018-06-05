package it.polimi.ingsw.model;

import java.io.Serializable;

public class Window implements Serializable {

    private boolean isEmpty;
    private String name;
    private int difficulty;
    private Space[][] window;

    public Window(int x){
        isEmpty = true;
        window = new Space[4][5];
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                window[i][j] = new Space(Colors.W, 0);
            }
        }

        switch (x){
            case 1:
                this.name = "Bellesguard";
                this.difficulty = 3;
                window[0][0].setColor(Colors.B);
                window[0][1].setValue(6);
                window[0][4].setColor(Colors.Y);
                window[1][1].setValue(3);
                window[1][2].setColor(Colors.B);
                window[2][1].setValue(5);
                window[2][2].setValue(6);
                window[2][3].setValue(2);
                window[3][1].setValue(4);
                window[3][3].setValue(1);
                window[3][4].setColor(Colors.G);
                break;

            case 2:
                this.name = "Battlo";
                this.difficulty = 5;
                window[0][2].setValue(6);
                window[1][1].setValue(5);
                window[1][2].setColor(Colors.B);
                window[1][3].setValue(4);
                window[2][0].setValue(3);
                window[2][1].setColor(Colors.G);
                window[2][2].setColor(Colors.Y);
                window[2][3].setColor(Colors.P);
                window[2][4].setValue(2);
                window[3][0].setValue(1);
                window[3][1].setValue(4);
                window[3][2].setColor(Colors.R);
                window[3][3].setValue(5);
                window[3][4].setValue(3);
                break;

            case 3:
                this.name = "Chromatic Splendor";
                this.difficulty = 4;
                window[0][2].setColor(Colors.G);
                window[1][0].setValue(2);
                window[1][1].setColor(Colors.Y);
                window[1][2].setValue(5);
                window[1][3].setColor(Colors.B);
                window[1][4].setValue(1);
                window[2][1].setColor(Colors.R);
                window[2][2].setValue(3);
                window[2][3].setColor(Colors.P);
                window[3][0].setValue(1);
                window[3][2].setValue(6);
                window[3][4].setValue(4);
                break;

            case 4:
                this.name = "Comitas";
                this.difficulty = 5;
                window[0][0].setColor(Colors.Y);
                window[0][2].setValue(2);
                window[0][4].setValue(6);
                window[1][1].setValue(4);
                window[1][3].setValue(5);
                window[1][4].setColor(Colors.Y);
                window[2][3].setColor(Colors.Y);
                window[2][4].setValue(5);
                window[3][0].setValue(1);
                window[3][1].setValue(2);
                window[3][2].setColor(Colors.Y);
                window[3][3].setValue(3);
                break;

            case 5:
                this.name = "Fulgor del Cielo";
                this.difficulty = 5;
                window[0][1].setColor(Colors.B);
                window[0][2].setColor(Colors.R);
                window[1][1].setValue(4);
                window[1][2].setValue(5);
                window[1][4].setColor(Colors.B);
                window[2][0].setColor(Colors.B);
                window[2][1].setValue(2);
                window[2][3].setColor(Colors.R);
                window[2][4].setValue(5);
                window[3][0].setValue(6);
                window[3][1].setColor(Colors.R);
                window[3][2].setValue(3);
                window[3][3].setValue(1);
                break;

            case 6:
                this.name = "Luz Celestial";
                this.difficulty = 3;
                window[0][2].setColor(Colors.R);
                window[0][3].setValue(5);
                window[1][0].setColor(Colors.P);
                window[1][1].setValue(4);
                window[1][3].setColor(Colors.G);
                window[1][4].setValue(3);
                window[2][0].setValue(6);
                window[2][3].setColor(Colors.B);
                window[3][1].setColor(Colors.Y);
                window[3][2].setValue(2);
                break;

            case 7:
                this.name = "Lux Mundi";
                this.difficulty = 6;
                window[0][2].setValue(1);
                window[1][0].setValue(1);
                window[1][1].setColor(Colors.G);
                window[1][2].setValue(3);
                window[1][3].setColor(Colors.B);
                window[1][4].setValue(2);
                window[2][0].setColor(Colors.B);
                window[2][1].setValue(5);
                window[2][2].setValue(4);
                window[2][3].setValue(6);
                window[2][4].setColor(Colors.G);
                window[3][1].setColor(Colors.B);
                window[3][2].setValue(5);
                window[3][3].setColor(Colors.G);
                break;

            case 8:
                this.name = "Lux Astram";
                this.difficulty = 5;
                window[0][1].setValue(1);
                window[0][2].setColor(Colors.G);
                window[0][3].setColor(Colors.P);
                window[0][4].setValue(4);
                window[1][0].setValue(6);
                window[1][1].setColor(Colors.P);
                window[1][2].setValue(2);
                window[1][3].setValue(5);
                window[1][4].setColor(Colors.G);
                window[2][0].setValue(1);
                window[2][1].setColor(Colors.G);
                window[2][2].setValue(5);
                window[2][3].setValue(3);
                window[2][4].setColor(Colors.P);
                break;

            case 9:
                this.name = "Industria";
                this.difficulty = 5;
                window[0][0].setValue(1);
                window[0][1].setColor(Colors.R);
                window[0][2].setValue(3);
                window[0][4].setValue(6);
                window[1][0].setValue(5);
                window[1][1].setValue(4);
                window[1][2].setColor(Colors.R);
                window[1][3].setValue(2);
                window[2][2].setValue(5);
                window[2][3].setColor(Colors.R);
                window[2][4].setValue(1);
                window[3][3].setValue(3);
                window[3][4].setColor(Colors.R);
                break;

            case 11:
                this.name = "Symphony of Light";
                this.difficulty = 6;
                window[0][0].setValue(2);
                window[0][2].setValue(5);
                window[0][4].setValue(1);
                window[1][0].setColor(Colors.Y);
                window[1][1].setValue(6);
                window[1][2].setColor(Colors.P);
                window[1][3].setValue(2);
                window[1][4].setColor(Colors.R);
                window[2][1].setColor(Colors.B);
                window[2][2].setValue(4);
                window[2][3].setColor(Colors.G);
                window[3][1].setValue(3);
                window[3][3].setValue(5);
                break;

            case 13:
                this.name = "Water of Life";
                this.difficulty = 6;
                window[0][0].setValue(6);
                window[0][1].setColor(Colors.B);
                window[0][4].setValue(1);
                window[1][1].setValue(5);
                window[1][2].setColor(Colors.B);
                window[2][0].setValue(4);
                window[2][1].setColor(Colors.R);
                window[2][2].setValue(2);
                window[2][3].setColor(Colors.B);
                window[3][0].setColor(Colors.G);
                window[3][1].setValue(6);
                window[3][2].setColor(Colors.Y);
                window[3][3].setValue(3);
                window[3][4].setColor(Colors.P);
                break;

            case 15:
                this.name = "Sun's Glory";
                this.difficulty = 6;
                window[0][0].setValue(1);
                window[0][1].setColor(Colors.P);
                window[0][2].setColor(Colors.Y);
                window[0][4].setValue(4);
                window[1][0].setColor(Colors.P);
                window[1][1].setColor(Colors.Y);
                window[1][4].setValue(6);
                window[2][0].setColor(Colors.Y);
                window[2][3].setValue(5);
                window[2][4].setValue(3);
                window[3][1].setValue(5);
                window[3][2].setValue(4);
                window[3][3].setValue(2);
                window[3][4].setValue(1);
                break;

            case 10:
                this.name = "Via Lux";
                this.difficulty = 4;
                window[0][0].setColor(Colors.Y);
                window[0][2].setValue(6);
                window[1][1].setValue(1);
                window[1][2].setValue(5);
                window[1][4].setValue(2);
                window[2][0].setValue(3);
                window[2][1].setColor(Colors.Y);
                window[2][2].setColor(Colors.R);
                window[2][3].setColor(Colors.P);
                window[3][2].setValue(4);
                window[3][3].setValue(3);
                window[3][4].setColor(Colors.R);
                break;

            case 12:
                this.name = "Virtus";
                this.difficulty = 5;
                window[0][0].setValue(4);
                window[0][2].setValue(2);
                window[0][3].setValue(5);
                window[0][4].setColor(Colors.G);
                window[1][2].setValue(6);
                window[1][3].setColor(Colors.G);
                window[1][4].setValue(2);
                window[2][1].setValue(3);
                window[2][2].setColor(Colors.G);
                window[2][3].setValue(4);
                window[3][0].setValue(5);
                window[3][1].setColor(Colors.G);
                window[3][2].setValue(1);
                break;

            case 14:
                this.name = "Gravitas";
                this.difficulty = 5;
                window[0][0].setValue(1);
                window[0][2].setValue(3);
                window[0][3].setColor(Colors.B);
                window[1][1].setValue(2);
                window[1][2].setColor(Colors.B);
                window[2][0].setValue(6);
                window[2][1].setColor(Colors.B);
                window[2][3].setValue(4);
                window[3][0].setColor(Colors.B);
                window[3][1].setValue(5);
                window[3][2].setValue(2);
                window[3][4].setValue(1);
                break;

            case 16:
                this.name = "Firelight";
                this.difficulty = 5;
                window[0][0].setValue(3);
                window[0][1].setValue(4);
                window[0][2].setValue(1);
                window[0][3].setValue(5);
                window[1][1].setValue(6);
                window[1][2].setValue(2);
                window[1][4].setColor(Colors.Y);
                window[2][3].setColor(Colors.Y);
                window[2][4].setColor(Colors.R);
                window[3][0].setValue(5);
                window[3][2].setColor(Colors.Y);
                window[3][3].setColor(Colors.R);
                window[3][4].setValue(6);
                break;

            case 17:
                this.name = "Shadow Thief";
                this.difficulty = 5;
                window[0][0].setValue(6);
                window[0][1].setColor(Colors.P);
                window[0][4].setValue(5);
                window[1][0].setValue(5);
                window[1][2].setColor(Colors.P);
                window[2][0].setColor(Colors.R);
                window[2][1].setValue(6);
                window[2][3].setColor(Colors.P);
                window[3][0].setColor(Colors.Y);
                window[3][1].setColor(Colors.R);
                window[3][2].setValue(5);
                window[3][3].setValue(4);
                window[3][4].setValue(3);
                break;

            case 19:
                this.name = "Ripples of Light";
                this.difficulty = 5;
                window[0][3].setColor(Colors.R);
                window[0][4].setValue(5);
                window[1][2].setColor(Colors.P);
                window[1][3].setValue(4);
                window[1][4].setColor(Colors.B);
                window[2][1].setColor(Colors.B);
                window[2][2].setValue(3);
                window[2][3].setColor(Colors.Y);
                window[2][4].setValue(6);
                window[3][0].setColor(Colors.Y);
                window[3][1].setValue(2);
                window[3][2].setColor(Colors.G);
                window[3][3].setValue(1);
                window[3][4].setColor(Colors.R);
                break;

            case 21:
                this.name = "Firmitas";
                this.difficulty = 5;
                window[0][0].setColor(Colors.P);
                window[0][1].setValue(6);
                window[0][4].setValue(3);
                window[1][0].setValue(5);
                window[1][1].setColor(Colors.P);
                window[1][2].setValue(3);
                window[2][1].setValue(2);
                window[2][2].setColor(Colors.P);
                window[2][3].setValue(1);
                window[3][1].setValue(1);
                window[3][2].setValue(5);
                window[3][3].setColor(Colors.P);
                window[3][4].setValue(4);
                break;

            case 23:
                this.name = "Aurorae Magnificus";
                this.difficulty = 5;
                window[0][0].setValue(5);
                window[0][1].setColor(Colors.G);
                window[0][2].setColor(Colors.B);
                window[0][3].setColor(Colors.P);
                window[0][4].setValue(2);
                window[1][0].setColor(Colors.P);
                window[1][4].setColor(Colors.Y);
                window[2][0].setColor(Colors.Y);
                window[2][2].setValue(6);
                window[2][4].setColor(Colors.P);
                window[3][0].setValue(1);
                window[3][3].setColor(Colors.G);
                window[3][4].setValue(4);
                break;

            case 18:
                this.name = "Sun Catcher";
                this.difficulty = 3;
                window[0][1].setColor(Colors.B);
                window[0][2].setValue(2);
                window[0][4].setColor(Colors.Y);
                window[1][1].setValue(4);
                window[1][3].setColor(Colors.R);
                window[2][2].setValue(5);
                window[2][3].setColor(Colors.Y);
                window[3][0].setColor(Colors.G);
                window[3][1].setValue(3);
                window[3][4].setColor(Colors.P);
                break;

            case 20:
                this.name = "Fractal Drops";
                this.difficulty = 3;
                window[0][1].setValue(4);
                window[0][3].setColor(Colors.Y);
                window[0][4].setValue(6);
                window[1][0].setColor(Colors.R);
                window[1][2].setValue(3);
                window[2][2].setColor(Colors.R);
                window[2][3].setColor(Colors.P);
                window[2][4].setValue(1);
                window[3][0].setColor(Colors.B);
                window[3][1].setColor(Colors.Y);
                break;

            case 22:
                this.name = "Kaleidoscopic Dream";
                this.difficulty = 4;
                window[0][0].setColor(Colors.Y);
                window[0][1].setColor(Colors.B);
                window[0][4].setValue(1);
                window[1][0].setColor(Colors.G);
                window[1][2].setValue(5);
                window[1][4].setValue(4);
                window[2][0].setValue(3);
                window[2][2].setColor(Colors.R);
                window[2][4].setColor(Colors.G);
                window[3][0].setValue(2);
                window[3][3].setColor(Colors.B);
                window[3][4].setColor(Colors.Y);
                break;

            case 24:
                this.name = "Aurora Sagradis";
                this.difficulty = 4;
                window[0][0].setColor(Colors.R);
                window[0][2].setColor(Colors.B);
                window[0][4].setColor(Colors.Y);
                window[1][0].setValue(4);
                window[1][1].setColor(Colors.P);
                window[1][2].setValue(3);
                window[1][3].setColor(Colors.G);
                window[1][4].setValue(2);
                window[2][1].setValue(1);
                window[2][3].setValue(5);
                window[3][2].setValue(6);
                break;

            default:
                break;
        }
    }

    public boolean getIsEmpty(){
        return isEmpty;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public Space[][] getWindow() {
        return window;
    }

    public void setIsEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }

    public void setWindow(Dice dice, int i, int j){
        this.window[i][j].setDice(dice);
        for (Space[] matrix : window){
            for (Space space : matrix){
                if (!space.getIsEmpty()){
                    this.setIsEmpty(false);
                    return;
                }
            }
        }
        this.setIsEmpty(true);
    }

    public boolean neighboursColorRestriction(Dice dice, int i, int j){
        //return true se puoi inserire
        //return false se a N S E W c'è un dado dello stesso colore
        for (int x = -1; x < 2; x += 2) {
            try {
                if (dice.getColor().equals(window[i + x][j].getDice().getColor()))
                    return false;
            } catch (Exception e) {
                //DO NOTHING
            }
        }
        for (int y = -1; y < 2; y += 2) {
            try {
                if (dice.getColor().equals(window[i][j + y].getDice().getColor()))
                    return false;
            } catch (Exception e) {
                //DO NOTHING
            }
        }
        return true;
    }

    public boolean neighboursNumberRestriction(Dice dice, int i, int j){
        //return true se puoi inserire
        //return false se a N S E W c'è un dado dello stesso numero
        for (int x = -1; x < 2; x += 2) {
            try {
                if (dice.getValue() == (window[i + x][j].getDice().getValue()))
                    return false;
            } catch (Exception e) {
                //DO NOTHING
            }
        }
        for (int y = -1; y < 2; y += 2) {
            try {
                if (dice.getValue() == (window[i][j + y].getDice().getValue()))
                    return false;
            } catch (Exception e) {
                //DO NOTHING
            }
        }
        return true;
    }

    public boolean neighboursPositionRestriction(int i, int j){
        //return true se puoi inserire
        //return false se non c'è nemmeno un dado adiacente
        for (int y = -1; y < 2; y += 2) {
            try {
                if (!window[i][j + y].getIsEmpty())
                    return true;
            } catch (Exception e) {
                //DO NOTHING
            }
        }
        for (int x = -1; x < 2; x += 2){
            for (int y = -1; y < 2; y ++){
                try {
                    if (!window[i + x][j + y].getIsEmpty())
                        return true;
                } catch (Exception e) {
                    //DO NOTHING
                }
            }
        }
        return false;
    }

    public boolean spaceColorRestriction(Dice dice, int i, int j){
        //return true se puoi inserire
        return !(!window[i][j].getIsEmpty() || (!window[i][j].getColor().equals(dice.getColor()) && !window[i][j].getColor().equals(Colors.W)));

    }

    public boolean spaceNumberRestriction(Dice dice, int i, int j){
        //return true se puoi inserire
        return !(!window[i][j].getIsEmpty() || (window[i][j].getValue() != dice.getValue() && window[i][j].getValue() != 0));

    }

    public boolean verifyFirstDiceRestriction(Dice dice, int i, int j){
        //return true se puoi inserire
        return ( (((i == 0 || i == 3) && (j >= 0 && j <= 4)) || ((j == 0 || j == 4) && (i >= 0 && i <= 3))) && this.spaceColorRestriction(dice, i , j) && this.spaceNumberRestriction(dice, i, j));
    }

    public boolean verifyAllRestrictions(Dice dice, int i, int j){
        //return true se puoi inserire
        return (this.neighboursColorRestriction(dice, i, j) && this.neighboursNumberRestriction(dice, i, j) && this.neighboursPositionRestriction(i, j) && this.spaceColorRestriction(dice, i, j) && this.spaceNumberRestriction(dice, i, j));
    }

}
