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
public class MovelHelpView {

public MovelHelpView() {
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
        System.out.println("………………………………………");
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
        String choice=in.next().trim();
        return choice;
    }

    private void doAction(char in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
