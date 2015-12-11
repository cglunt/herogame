/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.control;

/**
 *
 * @author Steph Ogden & Cynthia Glunt
 */
import byui.cit260.herogame.exceptions.MapControllerException;
import byui.cit260.herogame.model.Game;
import byui.cit260.herogame.model.Player;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import superherogame.SuperHeroGame;
import static superherogame.SuperHeroGame.setCurrentGame;

public class GameController {

    private Game currentGame;

    public Game createNewGame(String player, char mapSize) {
        currentGame = new Game();
        currentGame.setPlayer(createNewPlayer(player));
        currentGame.setMap(MovementController.createMap(mapSize));
        setCurrentGame(currentGame);
        try {
            MovementController.movePlayer(currentGame.getPlayer(), new Point(1, 1));
        } catch (MapControllerException ex) {
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error");
        }

        SuperHeroGame.currentGame = currentGame; //Initializing singleton instance
        return currentGame;
    }

    public void saveGame() {

    }

    public void exitGame() {
        exitGame();
    }

    public Player createNewPlayer(String player) {
        Player newPlayer = new Player();
        newPlayer.setName(player);
        return newPlayer;
    }

}
