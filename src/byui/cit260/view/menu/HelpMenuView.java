/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

/**
 *
 * @author Cindy Glunt & Steph Ogden
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
 
            super("Please select an option:\n" 
            + "G  - What is the goal of the game?\n" 
            + "M - How to Move\n"
            + "H - Hero & Item Point Values\n"
            + "V - Villian Point Values\n"
            + "B - How to Battle\n"
            + "E - Exit Help Menu\n");

    }



    @Override
    public boolean doAction(char input) {

        switch (input) {

            case 'G':
                showGoalHelp();
                break;
            case 'M':
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
                return false;
            default:
                System.out.println("Please select a valid option.");
        }
        
        return true;
    }

    private void showGoalHelp() {
        GoalHelpView goalMenu = new GoalHelpView();
        goalMenu.display();
    }

    private void showMoveHelp() {
        MoveHelpView moveMenu = new MoveHelpView();
        moveMenu.display();
    }

    private void showHeroPoints() {
        HeroPointsView heroMenu = new HeroPointsView();
        heroMenu.display();
    }

    private void showVillianPoints() {
        VillianHelpView villianMenu = new VillianHelpView();
        villianMenu.display();
    }

    private void showBattleHelp() {
        BattleViewMenu battleMenu = new BattleViewMenu();
        battleMenu.display();
    }

    private void exitGameHelp() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}
