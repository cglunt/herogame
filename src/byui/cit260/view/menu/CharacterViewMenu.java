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
public class CharacterViewMenu extends View {

    public CharacterViewMenu() {

        super("Please select an option:\n"
                + "H  - View Hero Characters & Power\n"
                + "V - View Villain Characters & Power\n"
                + "C - View Captive Characters & Power\n"
                + "I - View Available Items & Power Values\n"
                + "E - Exit and Return to Main Menu");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {

            case 'H':
                showHeroes();
                break;
            case 'V':
                showVillains();
                break;
            case 'C':
                showCaptives();
                break;
            case 'I':
                showItems();
            case 'E':
                return false;
            default:
                System.out.println("Please select a valid option.");
        }
        return true;
    }

    private void showHeroes() {
        System.out.println("Heroes & Strength Value...........\n"
                + "Superman - 10 |\n"
                + "Spiderman - 9 |\n"
                + "Batman - 6 |\n"
                + "Hulk - 10 |\n"
                + "Thor - 7 |\n"
                + "Wolverine - 8 |\n"
                + "StarLord - 7 |\n"
                + "Ironman - 9 |\n"
                + "He Man - 10 |\n"
                + "Captain America - 7 |\n"
                + "Wonder Woman - 10 |\n"
                + "Black Widow - 6 |\n"
                + "Rogue - 7 |"
                + "Storm - 8 |"
                + "Super Girl - 9 |"
                + "She Ra - 10 |"
                + "Jessica Jones - 6");

    }

    private void showVillains() {
        System.out.println("Villains & Strength Value"
                + "Magneto - 9"
                + "Joker - 8"
                + "Lex Luthor - 6"
                + "Loki - 7"
                + "Cat Woman - 5"
                + "Red Skull - 7"
                + "Mystique - 8"
                + "Bane - 8"
                + "Skeletor - 9\n");
    }

    private void showCaptives() {
        System.out.println("Captives & Strength Value\n");
    }

    private void showItems() {
        System.out.println("Items & Strength Value\n");
    }

}
