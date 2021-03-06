/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

/**
 *
 * @author Steph Ogden
 */
//relationship 'is a'
public class Villains extends CharacterModel {

    public static double MAX_VILLAINS_DAMAGE;

    // class instance variables
    private double Strength;

    public double getStrength() {
        return Strength;
    }

    public void setStrength(double Strength) {
        this.Strength = Strength;
        this.setHitPoints(Strength);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.Strength) ^ (Double.doubleToLongBits(this.Strength) >>> 32));
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
        final Villains other = (Villains) obj;
        if (Double.doubleToLongBits(this.Strength) != Double.doubleToLongBits(other.Strength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getDescription();
    }

    public Villains(double Strength) {
        this.Strength = Strength;
        this.setHitPoints(Strength);
    }

}
