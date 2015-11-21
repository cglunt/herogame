/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherogame;

import byui.cit260.herogame.model.CharacterModel;
import byui.cit260.herogame.model.Game;
import byui.cit260.herogame.model.Hero;
import byui.cit260.herogame.model.Villains;
import byui.cit260.view.menu.MainMenuView;
import byui.cit260.view.menu.WelcomeView;
import java.util.ArrayList;

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
    public static ArrayList<CharacterModel> getCharacters() {
        ArrayList<CharacterModel> characters=new ArrayList<> ();
        Hero superman = new Hero(10);
        superman.setDescription("Faster than a speeding bullet.");
        superman.setName("Superman");
        characters.add(superman);
        
        Hero spiderman = new Hero(9);
        spiderman.setDescription("Climbs walls.");
        spiderman.setName("Spiderman");
        characters.add(spiderman);
        
        Hero batman = new Hero(6);
        batman.setDescription("Faster than a speeding bullet.");
        batman.setName("Batman");
        characters.add(batman);
        
        Hero hulk = new Hero(10);
        hulk.setDescription("Climbs walls.");
        hulk.setName("Hulk");
        characters.add(hulk);
        
        Hero thor = new Hero(7);
        thor.setDescription("Faster than a speeding bullet.");
        thor.setName("Thor");
        characters.add(thor);
        
        Hero wolverine = new Hero(8);
        wolverine.setDescription("Climbs walls.");
        wolverine.setName("Wolverine");
        characters.add(wolverine);
        
        Hero starlord = new Hero(7);
        starlord.setDescription("Faster than a speeding bullet.");
        starlord.setName("Starlord");
        characters.add(starlord);
        
        Hero ironman = new Hero(9);
        ironman.setDescription("Climbs walls.");
        ironman.setName("Ironman");
        characters.add(ironman);
                
        Hero heman = new Hero(8);
        heman.setDescription("Faster than a speeding bullet.");
        heman.setName("Heman");
        characters.add(heman);
        
        Hero captainamerica = new Hero(9);
        captainamerica.setDescription("Climbs walls.");
        captainamerica.setName("Captain America");
        characters.add(captainamerica);
        
        Hero wonderwoman = new Hero(7);
        wonderwoman.setDescription("Faster than a speeding bullet.");
        wonderwoman.setName("Wonder Woman");
        characters.add(wonderwoman);
        
        Hero blackwidow = new Hero(8);
        blackwidow.setDescription("Climbs walls.");
        blackwidow.setName("Black Widow");
        characters.add(blackwidow);
        
        Hero rogue = new Hero(7);
        rogue.setDescription("Faster than a speeding bullet.");
        rogue.setName("Rogue");
        characters.add(rogue);
        
        Hero storm = new Hero(9);
        storm.setDescription("Climbs walls.");
        storm.setName("Storm");
        characters.add(storm);
                
        Hero supergirl = new Hero(8);
        supergirl.setDescription("Faster than a speeding bullet.");
        supergirl.setName("Super Girl");
        characters.add(supergirl);
        
        Hero shera = new Hero(9);
        shera.setDescription("Climbs walls.");
        shera.setName("Shera");
        characters.add(shera);
        
        Hero jessicajones = new Hero(9);
        jessicajones.setDescription("Climbs walls.");
        jessicajones.setName("Jessica Jones");
        characters.add(jessicajones);
        
        Villains magneto = new Villains(9);
        magneto.setDescription("Climbs walls.");
        magneto.setName("Magneto");
        characters.add(magneto);
                
        Villains joker = new Villains(9);
        joker.setDescription("Climbs walls.");
        joker.setName("Joker");
        characters.add(joker);
        
        Villains lexluthor = new Villains(9);
        lexluthor.setDescription("Climbs walls.");
        lexluthor.setName("Lex Luthor");
        characters.add(lexluthor);
        
        Villains loki = new Villains(9);
        loki.setDescription("Climbs walls.");
        loki.setName("Loki");
        characters.add(loki);
        
        Villains catwoman = new Villains(9);
        catwoman.setDescription("Climbs walls.");
        catwoman.setName("Catwoman");
        characters.add(catwoman);
                
        Villains redskull = new Villains(9);
        redskull.setDescription("Climbs walls.");
        redskull.setName("Redskull");
        characters.add(redskull);
                
        Villains mystique = new Villains(9);
        mystique.setDescription("Climbs walls.");
        mystique.setName("Mystique");
        characters.add(mystique);
        
        Villains bane = new Villains(9);
        bane.setDescription("Climbs walls.");
        bane.setName("Bane");
        characters.add(bane);
        
        Villains skeletor = new Villains(9);
        skeletor.setDescription("Climbs walls.");
        skeletor.setName("Skeletor");
        characters.add(skeletor);
        
        return characters;
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
