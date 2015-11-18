/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view.menu;

/**
 *
 * @author Steph
 */
public class BattleView extends View {
    
    public BattleView() {
        super("Please select an option:\n" +
                 "A - Attack \n" +
                 "R - Attempt to run\n"); +
    }
    
    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'A':
                return attack();
            case 'R':
                return run();
            default:
                System.out.println("INPUT ERROR");
                break;
        }

        return true;

    }

    private boolean attack() {
        System.out.println("NOT IMPLEMENTED YET");
        return false;
    }

    private boolean run() {
        return false;
    }
}
