/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.control;

/**
 *
 * @author Steph Ogden and Cynthia Glunt
 */
import byui.cit260.herogame.model.Hero;
import byui.cit260.herogame.model.Item;
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Villains;

public class BattleController {

    /**
     * This method applies the player's damage to the villain without an item.
     * 
     * @param p The player
     * @param v The villains
     * @return true if the villain is defeated, false otherwise
     */
    public static boolean attackVillains(Player p, Villains v) {
        
        int playerDamage = (int)(v.getStrength() * Math.random()) + 1;
        
        v.setHitPoints(v.getHitPoints() - playerDamage);
        
        if(v.getHitPoints() <= 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static boolean attackPlayer(Player p, Villains v) {
        
        int villainsDamage = (int)(p.getStrength() * Math.random()) + 1;
        
        p.applyDamage(villainsDamage);
        
        if(p.getHitPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
 
}