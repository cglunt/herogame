/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import byui.cit260.herogame.control.MovementController;
import byui.cit260.herogame.exceptions.MapControllerException;
import byui.cit260.herogame.model.Captive;
import byui.cit260.herogame.model.Hero;
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Tiles;
import byui.cit260.herogame.model.Villains;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private void moveNorth() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveForward(p);
        } catch (MapControllerException ex) {
            System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
             displayTile(MovementController.getTile(p.getCoordinates()));
    }

    private void moveEast() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveRight(p);
        } catch (MapControllerException ex) {
             System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
             displayTile(MovementController.getTile(p.getCoordinates()));
    }

    private void moveSouth() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveBack(p);
        } catch (MapControllerException ex) {
             System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
             displayTile(MovementController.getTile(p.getCoordinates()));
    }

    private void moveWest() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveLeft(p);
        } catch (MapControllerException ex) {
             System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
             displayTile(MovementController.getTile(p.getCoordinates()));
    }
    
    private void displayTile(Tiles t) {
        System.out.println(("You have met the " + ((t.getCharacter() instanceof Villains)?"Villain " + t.getCharacter().toString():
                    (t.getCharacter() instanceof Hero)?"Hero " + t.getCharacter().toString():
                            (t.getCharacter() instanceof Captive)?"Captive " + t.getCharacter().toString():"Unknown")));
    } 
//    class TileView extends View {
//        public TileView(Tiles t) {
//            super("You have met the " + ((t.getCharacter() instanceof Villains)?"Villain " + t.getCharacter().toString():
//                    (t.getCharacter() instanceof Hero)?"Hero " + t.getCharacter().toString():
//                            (t.getCharacter() instanceof Captive)?"Captive " + t.getCharacter().toString():"Unknown"));
//            
//        }
//     
//        @Override
//        public boolean doAction(char input) {
//            return true;
//        }
//    }
}
