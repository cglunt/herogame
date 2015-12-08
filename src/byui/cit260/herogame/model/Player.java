/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Steph Ogden
 */
public class Player extends CharacterModel {

  //  public static double MAX_DAMAGE;

    //Player has a collection of Heroes
    private String name;
    private ArrayList<Hero> team;
    private Point coordinates;

    public Player() {
        coordinates=new Point();
    }
    
    public Point getCoordinates() {
        return coordinates;
    }
    
    

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
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



    public void applyDamage(int villainsDamage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ArrayList<Hero> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Hero> team) {
        this.team = team;
    }

    public ArrayList<Item> getItems() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public ArrayList<Item> getItem() {
        return item;
    }



}
