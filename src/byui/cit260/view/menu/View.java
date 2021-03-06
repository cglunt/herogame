/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import java.util.Scanner;

/**
 *
 * @author Cynthia Glunt
 */
public abstract class View implements ViewInterface {

    private String menu;

    public View(String menuString) {
        menu = menuString;
    }

    @Override
    public void display() {
        boolean cont;

        do {
            System.out.println(menu);

            char in = getInput();

            cont = doAction(in);
        } while (cont);
    }

    @Override
    public char getInput() {
        Scanner in = new Scanner(System.in);
        String input = "";
        char rtn = 0;
        while (input.length() < 1) {
            input = in.nextLine();
            if (input.length() < 1) {
                System.out.println("Please select an option");
            } else {
                rtn = input.toUpperCase().charAt(0);
            }
        }
        return rtn;
    }

}
