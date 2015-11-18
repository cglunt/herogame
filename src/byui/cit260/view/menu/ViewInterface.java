/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

/**
 *
 * @author Cynthia Glunt
 */
public interface ViewInterface {
    public void display() ;
    
    public char getInput();
    
    public boolean doAction(char input);
}
