/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherogame;

import byui.cit260.herogame.model.Tiles;

/**
 *
 * @author Cindy Glunt & Steph Ogden
 */
public class SuperHeroGame {
    private static Object tileOne;

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
            
        }

    public static Object getTileOne() {
        return tileOne;
    }

    public static void setTileOne(Object tileOne) {
        SuperHeroGame.tileOne = tileOne;
    }
    }
    

