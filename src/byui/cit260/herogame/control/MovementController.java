/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.control;

/**
 *
 * @author Steph Ogden
 */
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.Captive;
import byui.cit260.herogame.model.Item;
import byui.cit260.herogame.model.Hero;

public class MovementController {
    Player p1;
    Captive c1;
    Item i1;
    Hero h1;
    BattleController b;
    
    public void movePlayer(){
        p1.setDescription("moving");
    }
    public void acquireItem(){
        i1=new Item();
    }
    public void beginBattle(){
        b.teamAttack(0);
        b.villainAttack(0);
    }
    public void acquireHero(){
        h1=new Hero(0);
    }
    public void saveCaptive(String newname){
        c1.setName(newname);
    }
}

    

