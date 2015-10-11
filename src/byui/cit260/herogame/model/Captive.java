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
 * @author Cindy Glunt 
 */
public class Captive implements Serializable{
    
    //class instance variables
    private String name;
    private String power;

    public Captive() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Captive{" + "name=" + name + ", power=" + power + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.power);
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
        final Captive other = (Captive) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.power, other.power)) {
            return false;
        }
        return true;
    }
  
    
    
    
}
