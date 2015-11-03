/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import java.util.Scanner;

/**
 *
 * @author Cindy Glunt & Steph Ogden
 */

public class HelpMenuView {
                public HelpMenuView() {
}
public void displayHelp() {
    System.out.println("Please select an option:");
    System.out.println("G  - What is the goal of the game?");
    System.out.println("M - How to Move");
    System.out.println("H - Hero & Item Point Values");
    System.out.println("V - Villian Point Values");
    System.out.println("B - How to Battle");
    System.out.println("E - Exit Help Menu");
}
public          char getInput() {
Scanner in = new Scanner(System.in);
String input = "";
                                char rtn = 0 ;
                while(input.length() < 1) {
                displayHelp();
                input = in.nextLine();
                if(input.length() < 1) {
                                System.out.println("Please select an option");
                                displayHelp();
} else {
rtn =input.toUpperCase().charAt(0);
if(rtn != 'G' &&  rtn != 'M' && rtn != 'H' && rtn != 'V' && rtn != 'B' && rtn != 'E') {
                System.out.println("Please select a valid input.");
                input = "";
}
}
                }
    return rtn;
}

 
public void doAction(char input) {
                    
             
switch(input) {
    

case 'G' :
showGoalHelp();
break;
case 'M' :
showMoveHelp();
break;
case 'H':
showHeroPoints();
break;
case 'V':
showVillianPoints();
break;
case 'B':
showBattleHelp();
break;
case 'E':
exitGameHelp();
break;

default:
System.out.println("INPUT ERROR");
}
}

    private void showGoalHelp() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void showMoveHelp() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void showHeroPoints() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void showVillianPoints() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void showBattleHelp() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private void exitGameHelp() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Public {

        public Public() {
        }
    }
}