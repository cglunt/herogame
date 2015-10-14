/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Steph Ogden
 */
public class CharacterModel implements Serializable {
    
    
    
  // class instance variables
        private String name;
        private String description;
        private double hitPoints;

    public CharacterModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
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
        final CharacterModel other = (CharacterModel) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CharacterModel{" + "name=" + name + ", description=" + description + ", hitPoints=" + hitPoints + '}';
    }
        
        
        
 



}