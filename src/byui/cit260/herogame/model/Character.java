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
public class Character {
    
    
    
  // class instance variables
        private String Strength;
        private String Speed;
        private String Team;

    public Character() {
    }
        
        
        
    public String getStrength() {
        return Strength;
    }

    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    public String getTeam1() {
        return Team;
    }

    public void setTeam(String team) {
        this.Team = team;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.Strength);
        hash = 67 * hash + Objects.hashCode(this.Speed);
        hash = 67 * hash + Objects.hashCode(this.Team);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.Strength, other.Strength)) {
            return false;
        }
        if (!Objects.equals(this.Speed, other.Speed)) {
            return false;
        }
        if (!Objects.equals(this.Team, other.Team)) {
            return false;
        }
        return false;
      
    }

    @Override
    public String toString() {
        return "Character{" + "Strength=" + Strength + ", Team=" + Team + ", Speed=" + Speed + '}';
    }

    Object getSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}