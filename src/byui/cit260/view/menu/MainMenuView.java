
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
public class MainMenuView extends View {

    public MainMenuView() {
    
        super("Please select an option:\n" +
              "S  - Start New Game\n" +
              "O - Open Saved Game\n" +
              "H - Help Menu\n" +
              "E - Exit Game\n");
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
                if (rtn != 'S' && rtn != 'O' && rtn != 'H' && rtn != 'E') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            }
        }
        return rtn;
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {

            case 'S':
                startNewGame();
                break;
            case 'O':
                openGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
               return false;
            default:
                System.out.println("Please select a valid option.");
        }
        return true;
    }

    private void startNewGame() {
        System.out.println("You selected start new game\n");
    }

    private void openGame() {
        System.out.println("You selected open a new game\n");
    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }



    

}
