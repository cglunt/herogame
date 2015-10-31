/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import java.util.Scanner;

/**
 *
 * @author Cindy Glunt
 */

public class MainMenuView {
                public MainMenuView() {
}
public void displayMenu() {
    System.out.println("Please select an option:");
    System.out.println("S  - Start New Game");
    System.out.println("O - Open Saved Game");
    System.out.println("H - Help Menu");
    System.out.println("E - Exit Game");
}
public          char getInput() {
Scanner in = new Scanner(System.in);
String input = "";
                                char rtn = 0 ;
                while(input.length() < 1) {
                displayMenu();
                input = in.nextLine();
                if(input.length() < 1) {
                                System.out.println("Please select an option");
                                displayMenu();
} else {
rtn =input.toUpperCase().charAt(0);
if(rtn != 'S' &&  rtn != 'O' && rtn != 'H' && rtn != 'E') {
                System.out.println("Please select a valid input.");
                input = "";
}
}
                }
    return rtn;
}

 
public void doAction(char input) {
                    
             
switch(input) {
    

case 'S' :
startNewGame();
break;
case 'O' :
openGame();
break;
case 'H':
showHelpMenu();
break;
case 'E':
exitGame();
break;

default:
System.out.println("INPUT ERROR");
}
}

    private void startNewGame() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void openGame() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void showHelpMenu() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void exitGame() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Public {

        public Public() {
        }
    }
}