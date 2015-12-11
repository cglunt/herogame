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
 * @author Cindy
 */
public class Game implements Serializable {

    Player p1;
    Map m1;

    public Game() {

    }

    public Player getPlayer() {
        return p1;
    }

    public void setPlayer(Player p1) {
        this.p1 = p1;
    }

    public Map getMap() {
        return m1;
    }

    public void setMap(Map m1) {
        this.m1 = m1;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.p1);
        hash = 59 * hash + Objects.hashCode(this.m1);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.m1, other.m1)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "p1=" + p1 + ", m1=" + m1 + '}';
    }

    public Game(Player p1, Map m1) {
        this.p1 = p1;
        this.m1 = m1;
    }

}
