/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Steph Ogden
 */
public class Player extends CharacterModel {

    //Player has a collection of Heroes

    private String name;
    private ArrayList<Hero> team;
    //Player has a collection of Item
    private ArrayList<Item> item;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name:");

        String player;

        player = input.next();
    }

    public void setItem(String what_is_your_name) {

    }

}
