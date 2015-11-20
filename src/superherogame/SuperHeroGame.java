/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherogame;

import byui.cit260.herogame.model.Game;
import byui.cit260.view.menu.MainMenuView;
import byui.cit260.view.menu.WelcomeView;

/**
 * * import byui.cit260.herogame.model.Item; import
 * byui.cit260.herogame.model.Player; import byui.cit260.herogame.model.Tiles;
 */
/**
 * private static Object tileOne; private static Object playerOne;
 */
public class SuperHeroGame {

    private static Game currentGame;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();

        MainMenuView mainView = new MainMenuView();
        mainView.display();
//        char in = mainView.getInput();

//        System.out.println("YOU ENTERED " + in);
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game current) {
        SuperHeroGame.currentGame = current;
    }

}
/*
   
        
 @SuppressWarnings("LocalVariableHidesMemberVariable")
 Tiles tileOne;
 tileOne = new Tiles();
        
 Item Bow;
 Bow = new Item();
        
 tileOne.setItem("Bow");
        
 String tileInfo;
 tileInfo = tileOne.toString();
 System.out.println(tileInfo);
        
 Player playerOne;
 playerOne = new Player();
        
 playerOne.setItem("What is your name");
        
 String playerInfo;
 playerInfo = playerOne.toString();
 boolean PlayerInfo = false;
 System.out.println(PlayerInfo);
            
 }
    

 public static Object getTileOne() {
 return tileOne;
 }

 public static void setplayerOne(Object playerOne) {
 SuperHeroGame.playerOne = playerOne;
 }
    
 public static Object getPlayerOne() {
 return playerOne;
 }

 public static void setTileOne(Object playerOne) {
 SuperHeroGame.playerOne = tileOne;
 }
 }
    



 Player mainCharacter = new Player();
 WelcomeView welcomeView = new WelcomeView();
 WelcomeView.displayBanner();
 
 Player.setName(welcomeView.getPlayerName());
 WelcomeView.displayPlayerNameBanner(player);
 * */
