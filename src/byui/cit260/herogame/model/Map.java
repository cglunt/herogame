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

        return map.length;
    }

    public int getWidth() {

        return map[0].length;
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

}

// class instance variables

