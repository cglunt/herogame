/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.util.Objects;

/**
 *
 * @author Cindy Glunt 
 */
public class Captive extends CharacterModel{
    
    // class instance variables
       private String Message;

    public Captive(String Message) {
        this.Message = Message;
    }
       
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Message);
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
        if (!Objects.equals(this.Message, other.Message)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Captive{" + "Message=" + Message + '}';
    }
 
       
    
    
}

   