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
import byui.cit260.herogame.model.Game;
import byui.cit260.herogame.model.Player;
import superherogame.SuperHeroGame;

public class GameController {

    private Game currentGame;

    public Game createNewGame(String player, char mapSize) {
        currentGame = new Game();
        currentGame.setPlayer(createNewPlayer(player));
        currentGame.setMap(MovementController.createMap(mapSize));
        //TODO set the starting location of the player
        
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