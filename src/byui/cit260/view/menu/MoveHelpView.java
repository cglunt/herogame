/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import byui.cit260.herogame.model.Player;
import superherogame.SuperHeroGame;

/**
 *
 * @author Cindy Glunt & Steph Ogden
 */
public class MoveHelpView extends View {

    public MoveHelpView() {
        super("Please select an option:\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "Q - Quit to Main Menu\n");
    }

    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'N':
                moveNorth();
                break;
            case 'E':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'W':
                moveWest();
                break;
            case 'Q':
                return false;
            default:
                System.out.println("Please select a valid input");
                break;
        }

        return true;
    }
//add to movement controller
    private void moveNorth() { //TODO IMPLEMENT ME
        
        Player p = SuperHeroGame.currentGame.getPlayer(); //How to get the player
        
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveEast() {
        
        Player p = SuperHeroGame.currentGame.getPlayer();
        
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveSouth() {
        
        Player p = SuperHeroGame.currentGame.getPlayer();
        
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveWest() {
        
        Player p = SuperHeroGame.currentGame.getPlayer();
        
        System.out.println("NOT IMPLEMENTED YET");
    }

}