/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Steph Ogden
 */
public class Player extends CharacterModel {

  //  public static double MAX_DAMAGE;

    //Player has a collection of Heroes
    private String name;
    private ArrayList<Hero> team;
    //Player has a collection of Item
    private ArrayList<Item> item;

    public void setItem(String what_is_your_name) {

    }
    public double getStrength() {
        double strength = 0;
        for (Hero team1 : team) {
            strength += team1.getStrength();
        }
        for (Item item1 : item) {
            strength += item1.getStrength();
        }
        return strength;
    }

    
    //TODO implement these
    public Object getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void applyDamage(int villainsDamage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
