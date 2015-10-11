/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.util.Objects;

/**
 *
 * @author Steph Ogden
 */
public class Villains {
    
    
    
  // class instance variables
        private String Strength;
        @SuppressWarnings("unused")
        private String Speed;

    public Villains() {
    }
        
        
        
    public String getStrength() {
        return Strength;
    }

    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.Strength);
        hash = 67 * hash + Objects.hashCode(this.getSpeed());
        
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
        if (!Objects.equals(this.Strength, other.getStrength())) {
            return false;
        }
        if (!Objects.equals(this.getSpeed(), other.getSpeed())) {
            return false;}
        return false;
        }
        private Object getSpeed() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public String toString() {
        return "Villains{" + "Strength=" + Strength + ", Speed=" + getSpeed() + '}';
    }
       

  
}
