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
        System.out.println("Heroes & Strength Value\n"
                + "Superman - 10"
                + "Spiderman - 9"
                + "Batman - 6"
                + "Hulk - 10"
                + "Thor - 7"
                + "Wolverine - 8"
                + "StarLord - 7"
                + "Ironman - 9"
                + "He Man - 10"
                + "Captain America - 7"
                + "Wonder Woman - 10"
                + "Black Widow - 6"
                + "Rogue - 7"
                + "Storm - 8"
                + "Super Girl - 9"
                + "She Ra - 10"
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
