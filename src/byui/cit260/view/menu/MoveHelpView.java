/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import byui.cit260.herogame.control.BattleController;
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
        new TileView(MovementController.getTile(p.getCoordinates())).display();
    }

    private void moveEast() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveRight(p);
        } catch (MapControllerException ex) {
            System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
        new TileView(MovementController.getTile(p.getCoordinates())).display();
    }

    private void moveSouth() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveBack(p);
        } catch (MapControllerException ex) {
            System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
        new TileView(MovementController.getTile(p.getCoordinates())).display();
    }

    private void moveWest() {

        Player p = SuperHeroGame.currentGame.getPlayer();
        try {
            p = MovementController.moveLeft(p);
        } catch (MapControllerException ex) {
            System.out.println(ex.getMessage());
        }
        SuperHeroGame.currentGame.setPlayer(p);
        new TileView(MovementController.getTile(p.getCoordinates())).display();
    }

//    private void displayTile(Tiles t) {
//        System.out.println(("You have met the " + ((t.getCharacter() instanceof Villains)?"Villain " + t.getCharacter().toString():
//                    (t.getCharacter() instanceof Hero)?"Hero " + t.getCharacter().toString():
//                            (t.getCharacter() instanceof Captive)?"Captive " + t.getCharacter().toString():"Unknown")));
//        
//    } 
    class TileView extends View {

        private final Tiles t;

        public TileView(Tiles t) {
            super("You have met the " + ((t.getCharacter() instanceof Villains) ? "Villain " + t.getCharacter().toString()
                    + " \n Please select an option:\n"
                    + "R - Run Away\n"
                    + "F - Fight the Villain\n"
                    : ((t.getCharacter() instanceof Hero) ? "Hero " + t.getCharacter().toString()
                            + " who is now on your Avenger Team"
                            : (t.getCharacter() instanceof Captive) ? "Captive " + t.getCharacter().toString()
                                    + " who you've rescued and added strength to your Avenger Team" : "Unknown") 
                            + "\n press any key to continue."));
            this.t = t;

        }

        @Override
        public boolean doAction(char input) {
            if (t.getCharacter() instanceof Villains) {
                if (input == 'F') {
                    if (BattleController.attack(SuperHeroGame.currentGame.getPlayer(), (Villains)t.getCharacter())) {
                        System.out.println("You've defeated the Villain!");
                    }else {
                        System.out.println("You have been defeated");
                    }
                }
            }
            return false;
        }
    }
}
