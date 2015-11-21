/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;



/**
 *
 * @author Steph Ogden & Cynthia Glunt
 */

//relationship 'is a'
public class Hero extends CharacterModel {

    // class instance variables
    private double Strength;

    public double getStrength() {
        return Strength;
    }

    public void setStrength(double Strength) {
        this.Strength = Strength;
    }

    @Override
    public String toString() {
        return "Hero{" + "Strength=" + Strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.Strength) ^ (Double.doubleToLongBits(this.Strength) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hero other = (Hero) obj;
        if (Double.doubleToLongBits(this.Strength) != Double.doubleToLongBits(other.Strength)) {
            return false;
        }
        return true;
    }

    public Hero(double Strength) {
        this.Strength = Strength;
    }
    public Hero() {
        
    }
  
    

    }