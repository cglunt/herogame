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

        int playerDamage = (int) (p.getStrength() * Math.random()) + 1;

        v.setHitPoints(v.getHitPoints() - playerDamage);
        
        System.out.println("Player has total strength: " + p.getStrength());
        System.out.println("Player did " + playerDamage + " to villain");
        System.out.println("Villain has " + v.getHitPoints() + " hp left");

        if (v.getHitPoints() <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean attackPlayer(Player p, Villains v) {

        int villainsDamage = (int) (v.getStrength() * Math.random()) + 1;

        p.applyDamage(villainsDamage);
        
        System.out.println("Villain has total strength: " + v.getStrength());
        System.out.println("Villain did " + villainsDamage + " to player");
        
        for(Hero h : p.getTeam()) {
            System.out.println(h.getName() + " has " + h.getHitPoints() + " hp left");
        }
        

        if (p.isDefeated()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean attack(Player p, Villains v) {
        
        boolean finished = false;
        
        while(true) {
            finished = attackVillains(p, v);
            if(finished) {
                return true;
            }
            finished = attackPlayer(p, v);
            if(finished) {
                return false;
            }
        }
    }
}
