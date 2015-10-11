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
public class Map implements Serializable {
    


// class instance variables
   private String row;
   private String column;
   private String tiles;

    public Map() {
    }
   
   

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getTiles() {
        return tiles;
    }

    public void setTiles(String tiles) {
        this.tiles = tiles;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.row);
        hash = 61 * hash + Objects.hashCode(this.column);
        hash = 61 * hash + Objects.hashCode(this.tiles);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return Objects.equals(this.tiles, other.tiles);
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + ", tiles=" + tiles + '}';
    }
    
    
    
}


