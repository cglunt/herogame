/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Cindy Glunt
 */
public class Map implements Serializable {

    private Tiles[][] map;

    public Map() {
    }

    public int getHeight() {

        return map[0].length;
    }

    public int getWidth() {

        return map.length;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Arrays.deepHashCode(this.map);
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
        if (!Arrays.deepEquals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    public Tiles[][] getMap() {
        return map;
    }

    public void setMap(Tiles[][] map) {
        this.map = map;
    }

    public String viewMap() {
        String rtn = "";

        for (int i = 0; i < map.length; i++) {
            for (int j = map[0].length - 1; j >= 0; j--) {
                Tiles t = map[i][j];
                if (t.getItem() != null && t.getCharacter() != null) {
                    rtn += "i";
                }
                if (t.getItem() != null && t.getCharacter() == null) {
                    rtn += "i  ";
                }
                if (t.getCharacter() != null) {
                    if (t.getCharacter() instanceof Hero) {
                        rtn += "h  ";
                    }
                    if (t.getCharacter() instanceof Villains) {
                        rtn += "v  ";
                    }
                    if (t.getCharacter() instanceof Captive) {
                        rtn += "c  ";
                    }
                }
            }
            rtn += "\n";
        }

        return rtn;
    }

}

// class instance variables

