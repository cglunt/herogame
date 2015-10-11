/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.io.Serializable;
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
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + ", tiles=" + tiles + '}';
    }
    
    
    
}


