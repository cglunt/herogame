/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import byui.cit260.herogame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Cindy Glunt
 */
public class WelcomeView {
                public WelcomeView()  {
}
public void displayBanner() {
    System.out.println("………………………………………");
                System.out.println("Welcome to Super Hero Avengers");
                System.out.println("The Super Villains in the city kidnapped your friends");
                System.out.println("As you look to find them you meet Heroes along the way who join your Avenger team");
                System.out.println("You may also gather items that can help your team gain power to defeat the Villians");
                System.out.println("Together you and your Avenger team may meet Super Villians to fight to move on to save the captives in the city.");
                System.out.println("Save the captives and you save the city! Good Luck!");
                System.out.println("………………………………………");
 
}
public String getPlayerName() {
                Scanner in = new Scanner(System.in);
String name = "";
While(name.length() <2 ); {
                System.out.println("Please enter your name here: ");
                name = in.nextLine();
               
                if (name.length() <2) {
                  System.out.println("Please enter a name with at least two characters");
}
}
                return name;
}
                public void displayPlayerNameBanner(Player p) {

    System.out.println("…………………………………………");
    System.out.println("Welcome " + p.getName() + "!");
    System.out.println("Let’s get started and save the city!");
    System.out.println("…………………………………………");
}

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Public {

        public Public() {
        }
    }
}
 