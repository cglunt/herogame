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
        ArrayList<CharacterModel> characters = new ArrayList<>();
        Hero superman = new Hero(10);
        superman.setDescription("Faster than a speeding bullet.");
        superman.setName("Superman");
        characters.add(superman);

        Hero spiderman = new Hero(9);
        spiderman.setDescription("Climbing the walls.");
        spiderman.setName("Spiderman");
        characters.add(spiderman);

        Hero batman = new Hero(6);
        batman.setDescription("Nuh nuh nuh nuh nuh nuh BATMAN");
        batman.setName("Batman");
        characters.add(batman);

        Hero hulk = new Hero(10);
        hulk.setDescription("Hulk...SMASH!");
        hulk.setName("Hulk");
        characters.add(hulk);

        Hero thor = new Hero(7);
        thor.setDescription("God of Thunder");
        thor.setName("Thor");
        characters.add(thor);

        Hero wolverine = new Hero(8);
        wolverine.setDescription("Animal Keen Senses");
        wolverine.setName("Wolverine");
        characters.add(wolverine);

        Hero starlord = new Hero(7);
        starlord.setDescription("Interplanetary Policeman");
        starlord.setName("Starlord");
        characters.add(starlord);

        Hero ironman = new Hero(9);
        ironman.setDescription("Billionaire genius inventor.");
        ironman.setName("Ironman");
        characters.add(ironman);

        Hero heman = new Hero(10);
        heman.setDescription("By the Power of Grayskull.");
        heman.setName("Heman");
        characters.add(heman);

        Hero captainamerica = new Hero(7);
        captainamerica.setDescription("Patriotic Supersoldier.");
        captainamerica.setName("Captain America");
        characters.add(captainamerica);

        Hero wonderwoman = new Hero(10);
        wonderwoman.setDescription("Princess Diana of Themyscira.");
        wonderwoman.setName("Wonder Woman");
        characters.add(wonderwoman);

        Hero blackwidow = new Hero(6);
        blackwidow.setDescription("S.H.I.E.L.D Avenger Spy");
        blackwidow.setName("Black Widow");
        characters.add(blackwidow);

        Hero rogue = new Hero(7);
        rogue.setDescription("Superhuman mutant X-Men.");
        rogue.setName("Rogue");
        characters.add(rogue);

        Hero storm = new Hero(8);
        storm.setDescription("Superhuman mutant X-Men that controls the weather.");
        storm.setName("Storm");
        characters.add(storm);

        Hero supergirl = new Hero(9);
        supergirl.setDescription("Princess of Power.");
        supergirl.setName("Super Girl");
        characters.add(supergirl);

        Hero shera = new Hero(10);
        shera.setDescription("The Supergirl from Krypton.");
        shera.setName("Shera");
        characters.add(shera);

        Hero jessicajones = new Hero(6);
        jessicajones.setDescription("Alias Private Investigator");
        jessicajones.setName("Jessica Jones");
        characters.add(jessicajones);

        Villains magneto = new Villains(9);
        magneto.setDescription("Evil Genius.");
        magneto.setName("Magneto");
        characters.add(magneto);

        Villains joker = new Villains(8);
        joker.setDescription("Psycho Twisted Killer.");
        joker.setName("Joker");
        characters.add(joker);

        Villains lexluthor = new Villains(6);
        lexluthor.setDescription("Billionaire Mad Scientist.");
        lexluthor.setName("Lex Luthor");
        characters.add(lexluthor);

        Villains loki = new Villains(7);
        loki.setDescription("God of Mischief.");
        loki.setName("Loki");
        characters.add(loki);

        Villains catwoman = new Villains(5);
        catwoman.setDescription("Me-OW.");
        catwoman.setName("Catwoman");
        characters.add(catwoman);

        Villains redskull = new Villains(7);
        redskull.setDescription("Evil Nazi Scientist.");
        redskull.setName("Redskull");
        characters.add(redskull);

        Villains mystique = new Villains(8);
        mystique.setDescription("Shape Shifter");
        mystique.setName("Mystique");
        characters.add(mystique);

        Villains bane = new Villains(8);
        bane.setDescription("Venom Power.");
        bane.setName("Bane");
        characters.add(bane);

        Villains skeletor = new Villains(9);
        skeletor.setDescription("Evil Ruler.");
        skeletor.setName("Skeletor");
        characters.add(skeletor);

     //   Captive tinytim = new Captive(9);
        //    tinytim.setDescription("Merry Christmas, Everyone.");
        //    tinytim.setName("Tiny Tim");
        //   characters.add(tinytim);
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
