/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import static java.lang.System.in;
import java.util.Scanner;
import superherogame.help;

/**
 *
 * @author Steph Ogden
 */
@SuppressWarnings("InitializerMayBeStatic")
public class HelpMenuView {
    public HelpMenuView (){
        
    }

    /**
     *
     */
    public void helpMenu() {
   
    
        
}
public      char get.Input() {  
    Scanner in = new Scanner(System.in);
    String input = "";
    
    char rtn = 0;
    while(void() < 1) {
      displayMenu();  
    input = in.nextLine();
    
    
    if(input.length() < 1) {
    System.out.println("Please select an option: ");
     displayMenu();
     
   
} else {
    rtn = input.toUpperCase().charAt(0);
    if (rtn != 'S' && rtn != 'O' && rtn != 'M' && rtn != 'E') {
        System.out.println("Please select a valid input.");
        input = "";
    } 
    }
    }
               
    return rtn;{

}
    /**
     *
     * @param input
     */
    public void doAction (char input) {
    switch(input) {
       case 'S': 
           startNewGame();
           break;
       case 'O' :
           openGame();
           break;
       case 'M' :
           showMainMenu();
           break;
       case 'E' :
          exitGame();
           break;
       default:
           System.out.println("ERROR ON INPUT");
    }
}

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void openGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showMainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exitGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class rtn {

        public rtn() {
        }
    }
}