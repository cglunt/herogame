/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.control;

/**
 *
 *  @author Steph Ogden
 */
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Tiles;


public class GameController {
    
    Player p1;
    Player p2;
    Tiles tN;
    MovementController m1;
    double currentHitPoints1;
    double currentHitPoints2;
    
    public void runStart(){
        p1.setName("Player 1");
        p1.setName("Player 2");
        tN.getPlayer();
    }
    public void viewHighscores(){
        System.out.println("Player 1: "+p1.getHitPoints());
        System.out.println("Player 2: "+p2.getHitPoints());
    }
    public void saveGame(){
        p1.setHitPoints(currentHitPoints1);
        p1.setHitPoints(currentHitPoints2);
    }
    public void exitGame(){
        exitGame();
    }
    public void viewMap(){
        tN.getItem();
    }
    public void createNewPlayer(){
        p1=new Player();
        p2=new Player();
    }
    public void createNewGame(){
        m1.beginBattle();
    }
}

