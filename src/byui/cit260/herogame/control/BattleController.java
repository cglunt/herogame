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
import byui.cit260.herogame.model.Villains;

public class BattleController {

    Villains v1;
    Player p;

    public void teamAttack(double hitpts) {
        p.setHitPoints(hitpts);
    }

    public void villainAttack(double hitpts) {
        v1.setHitPoints(hitpts);
    }
}
