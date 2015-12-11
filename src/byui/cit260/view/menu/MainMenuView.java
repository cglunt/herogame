
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

import byui.cit260.herogame.control.GameController;

/**
 *
 * @author Cindy Glunt
 */
public class MainMenuView extends View {

    public MainMenuView() {

        super("Please select an option:\n"
                + "S  - Start New Game\n"
                + "O - Open Saved Game\n"
                + "H - Help Menu\n"
                + "G - Save Game\n"
                + "E - Exit Game\n");
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
            case 'G':
                saveGame();
                break;
            case 'E':
                return false;
            default:
                System.out.println("Please select a valid option.");
        }
        return true;
    }

    private void startNewGame() {
//        try {
        GameController startNew = new GameController();
        System.out.println("What size game do you want to play? S - Small M - Medium L - Large");
        char mapSize = this.getInput();
        //  startNew.createNewPlayer("What is your Name?");
        //String playerName = System.console().readLine();
        startNew.createNewGame("sample", mapSize);
        MoveHelpView moveMenu = new MoveHelpView();
        moveMenu.display();
        //remove once implemented in movementcontroller
//            throw new MovementControllerException();
//        } catch (MovementControllerException e) {
//            System.err.println("Exception Calleed");
//        }
    }

    private void openGame() {
        System.out.println("You selected open a new game\n");
    }

    private void saveGame() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
