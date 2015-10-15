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
public class Tiles implements Serializable{
     
    
  // class instance variables
        private Item item;
        private String characterModel;
        private Player player;
        
    public Tiles(Item item, String character, Player player) {
        this.item = item;
        this.characterModel = character;
        this.player = player;
    }

    public Tiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCharacter() {
        return characterModel;
    }

    public void setCharacter(String character) {
        this.characterModel = character;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.item);
        hash = 13 * hash + Objects.hashCode(this.characterModel);
        hash = 13 * hash + Objects.hashCode(this.player);
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
        if (!Objects.equals(this.characterModel, other.characterModel)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tiles{" + "item=" + item + ", characterModel=" + characterModel + ", player=" + player + '}';
    }



        
    
        
}