/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherogame;

import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Tiles;

/**
 *
 * @author Cindy Glunt & Steph Ogden
 */
public class SuperHeroGame {
    private static Object tileOne;
    private static Object playerOne;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        Tiles tileOne;
        tileOne = new Tiles();
        
        tileOne.setItem("Bow");
        
        String tileInfo;
        tileInfo = tileOne.toString();
        System.out.println(tileInfo);
        
         Player playerOne;
        playerOne = new Player();
        
        playerOne.setItem("What is your name");
        
        String playerInfo;
        playerInfo = playerOne.toString();
        boolean PlayerInfo = false;
        System.out.println(PlayerInfo);
            
        }
    

    public static Object getTileOne() {
        return tileOne;
    }

    public static void setplayerOne(Object playerOne) {
        SuperHeroGame.playerOne = playerOne;
    }
    
        public static Object getPlayerOne() {
        return playerOne;
    }

    public static void setTileOne(Object playerOne) {
        SuperHeroGame.playerOne = tileOne;
    }
    }
    

