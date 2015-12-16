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
import byui.cit260.herogame.model.Game;
import byui.cit260.herogame.model.Hero;
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Tiles;
import byui.cit260.herogame.model.Villains;
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
                + "V - View Map\n"
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
            case 'V':
                viewMap();
                break;
            case 'L':
                viewCurrentLocation();
                break;
            case 'T':
                viewTeam();
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

    private void viewTeam() {
        Player p = SuperHeroGame.currentGame.getPlayer();

        for (Hero h : p.getTeam()) {
            System.out.println("Name: " + h.getName() + "\t\tHP: " + h.getHitPoints());
        }
    }

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

    private void viewMap() {
        System.out.println(SuperHeroGame.currentGame.getMap().viewMap());
    }

    private void viewCurrentLocation() {
        System.out.println(SuperHeroGame.currentGame.getPlayer().getCoordinates());
    }

    //TILE VIEW
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
                                    + " who you've rescued and added strength to your Avenger Team" : "There is nothing here")
                    + "\n press any key to continue."));

            if (t.getCharacter() instanceof Hero) {
                SuperHeroGame.currentGame.getPlayer().getTeam().add((Hero) t.getCharacter());
                t.setCharacter(null);
            }
            if (t.getCharacter() instanceof Captive) {
                SuperHeroGame.currentGame.getPlayer().getCaptives().add((Captive) t.getCharacter());
                t.setCharacter(null);
            }

            this.t = t;

        }

        @Override
        public boolean doAction(char input) {
            if (t.getCharacter() instanceof Villains) {
                if (input == 'F') {
                    if (BattleController.attack(SuperHeroGame.currentGame.getPlayer(), (Villains) t.getCharacter())) {
                        System.out.println("CONGRATULATIONS! You've defeated the Villain!");
                        t.setCharacter(null);
                    } else {
                        System.out.println("OH NO! You have been defeated");
                    }
                }
            }
            return false;
        }
    }
}
