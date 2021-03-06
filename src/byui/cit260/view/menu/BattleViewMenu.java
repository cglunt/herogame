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
public class BattleViewMenu {

    public BattleViewMenu() {
    }

    public void display() {
        char in;
        do {
            System.out.println("Please select an option:");
            System.out.println("G  - What is the goal of the game?");
            System.out.println("M - How to Move");
            System.out.println("H - Hero & Item Point Values");
            System.out.println("V - Villian Point Values");
            System.out.println("E - Exit Help Menu");
            in = getInput();
            doAction(in);
        } while (in != 'E');
    }

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
                if (rtn != 'G' && rtn != 'M' && rtn != 'H' && rtn != 'V' && rtn != 'B' && rtn != 'E') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            }
        }
        return rtn;
    }

    public void doAction(char input) {

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
            case 'E':
                exitGameHelp();
                break;

            default:
                System.out.println("INPUT ERROR");
        }
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

    private void exitGameHelp() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}
