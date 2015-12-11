/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.exceptions;

/**
 *
 * @author Cindy
 */
public class MovementControllerException extends Exception {

    public MovementControllerException() {
    }

    public MovementControllerException(String string) {
        super(string);
    }

    public MovementControllerException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MovementControllerException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MovementControllerException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
