/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherogame;

import byui.cit260.herogame.model.Captive;
import byui.cit260.herogame.model.CharacterModel;
import byui.cit260.herogame.model.Game;
import byui.cit260.herogame.model.Hero;
import byui.cit260.herogame.model.Item;
import byui.cit260.herogame.model.Villains;
import byui.cit260.view.menu.MainMenuView;
import byui.cit260.view.menu.WelcomeView;
import java.util.ArrayList;

public class SuperHeroGame {

    public static Game currentGame;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        currentGame=new Game();
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();

        MainMenuView mainView = new MainMenuView();
        try {
            mainView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            welcomeView.displayBanner();

        }
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

        Captive tinytim = new Captive();
        tinytim.setDescription("Merry Christmas, Everyone.");
        tinytim.setName("Tiny Tim");
        characters.add(tinytim);

        Captive oliver = new Captive();
        oliver.setDescription("Please sir, I want some mo.");
        oliver.setName("Oliver");
        characters.add(oliver);

        Captive roadrunner = new Captive();
        roadrunner.setDescription("Beep, Beep");
        roadrunner.setName("Road Runner");
        characters.add(roadrunner);

        Captive gusgus = new Captive();
        gusgus.setDescription("Save Me Cinderelli");
        gusgus.setName("Gus Gus");
        characters.add(gusgus);

        Captive princesspeach = new Captive();
        princesspeach.setDescription("Save Me Mario!");
        princesspeach.setName("Princess Peach");
        characters.add(princesspeach);

        Captive oliveoil = new Captive();
        oliveoil.setDescription("Save Me Popeye!");
        oliveoil.setName("Olive Oil");
        characters.add(oliveoil);

        Captive bugsbunny = new Captive();
        bugsbunny.setDescription("What's up Doc?");
        bugsbunny.setName("Bugs Bunny");
        characters.add(bugsbunny);

        Captive princessleia = new Captive();
        princessleia.setDescription("Help me Obi Wan Kanobe... you're my only hope!");
        princessleia.setName("Princess Leia");
        characters.add(princessleia);

        Captive zelda = new Captive();
        zelda.setDescription("Save me Link!");
        zelda.setName("Princess Zelda");
        characters.add(zelda);

        Captive sleepingbeauty = new Captive();
        sleepingbeauty.setDescription("Once upon a dream...");
        sleepingbeauty.setName("Sleeping Beauty");
        characters.add(sleepingbeauty);

        Captive pepperpots = new Captive();
        pepperpots.setDescription("Save me Tony Stark!");
        pepperpots.setName("Pepper Pots");
        characters.add(pepperpots);

        // same for items as well
        for (int i = 0; i < 75; ++i) {
            Captive empty = new Captive();
            empty.setDescription("Nobody is here - Lucky Day");
            empty.setName("Empty");
            characters.add(empty);
        }
        return characters;

    }

    public static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();

        Item sword = new Item(8);
        sword.setName("Sword");
        items.add(sword);

        Item axe = new Item(6);
        axe.setName("Axe");
        items.add(sword);

        Item chainmail = new Item(5);
        chainmail.setName("Chain Mail");
        items.add(chainmail);

        Item helmet = new Item(5);
        helmet.setName("Helmet");
        items.add(helmet);

        Item ironsuit = new Item(10);
        ironsuit.setName("Iron Man Suit");
        items.add(ironsuit);

        Item machete = new Item(6);
        machete.setName("Machete");
        items.add(machete);

        Item freehug = new Item(2);
        freehug.setName("Free Hug");
        items.add(freehug);

        Item hammer = new Item(5);
        hammer.setName("Thor's Hammer");
        items.add(hammer);

        Item gummibearjuice = new Item(4);
        gummibearjuice.setName("Gummi Bear Juice");
        items.add(gummibearjuice);

        Item antidote = new Item(10);
        antidote.setName("Antidote");
        items.add(antidote);

        for (int i = 0; i < 75; ++i) {
            Item empty = new Item();
            empty.setName("Empty");
            items.add(empty);
        }

        return items;
    }
    
    
}