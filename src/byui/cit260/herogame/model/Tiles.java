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
 * @author Cynthia Glunt
 */
public class Tiles implements Serializable{
    
    
    
  // class instance variables
        private String item;
        private String character;
        private String player;
        private String team;

    public Tiles() {
    }
        
        
        
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.item);
        hash = 67 * hash + Objects.hashCode(this.character);
        hash = 67 * hash + Objects.hashCode(this.team);
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
        final Tiles other = (Tiles) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.team, other.team)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tiles{" + "item=" + item + ", character=" + character + ", player=" + player + ", team=" + team + '}';
    }
       

  
        
  
    
}
