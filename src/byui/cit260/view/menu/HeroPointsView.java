/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import java.util.Scanner;

/**
 *
 * @author Steph Ogden
 */
public class HeroPointsView {

    public HeroPointsView() {
    }
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    public void display() {
        char in;
        do {

            System.out.println("………………………………………");
            System.out.println("How to run a Battle with your Avenger Team and a found Villian");
            System.out.println("Still figuring out the details here... ");
            System.out.println("Heroes will score more points than villains");
            System.out.println("………………………………………");
            System.out.println("………………………………………");
            System.out.println("………………………………………");
            System.out.println("Please enter E to Exit");
            in = getInput().charAt(0);
            doAction(in);
        } while (in != 'E');
    }

    public String getInput() {
        Scanner in = new Scanner(System.in);
        String choice = in.next().trim();
        return choice;
    }

    private void doAction(char in) {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
