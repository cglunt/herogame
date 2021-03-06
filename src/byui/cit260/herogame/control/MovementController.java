/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.herogame.control;

/**
 *
 * @author Steph Ogden & Cynthia Glunt
 */
import byui.cit260.herogame.exceptions.MapControllerException;
import byui.cit260.herogame.model.Player;
import byui.cit260.herogame.model.CharacterModel;
import byui.cit260.herogame.model.Item;
import byui.cit260.herogame.model.Map;
import byui.cit260.herogame.model.Tiles;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import superherogame.SuperHeroGame;
import static superherogame.SuperHeroGame.getCurrentGame;

public class MovementController {

    public static final int LARGE = 10;
    public static final int MEDIUM = 8;
    public static final int SMALL = 6;

    public static Map createDefaultMap() {
        return createMap('M');
    }

    public static Map createMap(char mapSize) {
        int height = 0;
        int width = 0;
//can change height to row and width to column (optional)
        if (mapSize == 'M') {
            height = MEDIUM;
            width = MEDIUM;
        } else if (mapSize == 'S') {
            height = SMALL;
            width = SMALL;
        } else if (mapSize == 'L') {
            height = LARGE;
            width = LARGE;
        }
        Map map = new Map();
        Tiles[][] tiles = new Tiles[height][width];
        map.setMap(tiles);
        ArrayList<CharacterModel> characters = SuperHeroGame.getCharacters();
        ArrayList<Item> items = SuperHeroGame.getItems();
        Collections.shuffle(characters);
        Collections.shuffle(items);
        for (int i = 0, position = 0; i < tiles.length && position < characters.size(); i++) {
            for (int j = 0; j < tiles[i].length && position < characters.size(); j++) {
                Tiles t1 = new Tiles();
                t1.setCharacter(characters.get(position));
                if (position < items.size()) {
                    t1.setItem(items.get(position));
                }
                tiles[i][j] = t1;
                position++;
            }
        }
        return map;
    }

    /**
     *
     * @param p
     * @param coordinates
     * @return
     * @throws byui.cit260.herogame.exceptions.MapControllerException
     */
    public static int movePlayer(Player p, Point coordinates) throws MapControllerException {

        Map map = getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow > map.getWidth() || newColumn > map.getHeight()) {
            throw new MapControllerException("Can not move Player to this Tile "
                    + "because that space is outside "
                    + "the maps bounds.");

        }
        p.setCoordinates(coordinates);
        return 0;

    }

    public static Player moveForward(Player p) throws MapControllerException {
        Map map = getCurrentGame().getMap();
        Point row = p.getCoordinates();

        if (row.y + 1 == map.getHeight()) {
            throw new MapControllerException("Can not move Player to this Tile "
                    + "because that space is outside "
                    + "the maps bounds.");
        }

        row.y++;
        p.setCoordinates(row);

        return p;
    }

    public static Player moveBack(Player p) throws MapControllerException {
        Map map = getCurrentGame().getMap();
        Point row = p.getCoordinates();

        if (row.y == 0) {
            throw new MapControllerException("Can not move Player to this Tile"
                    + "because that space is outside"
                    + "the maps bounds.");
        }

        row.y--;
        p.setCoordinates(row);

        return p;
    }

    public static Player moveLeft(Player p) throws MapControllerException {
        Map map = getCurrentGame().getMap();
        Point row = p.getCoordinates();

        if (row.x == 0) {
            throw new MapControllerException("Can not move Player to this Tile "
                    + "because that space is outside "
                    + "the maps bounds.");
        }

        row.x--;
        p.setCoordinates(row);

        return p;
    }

    public static Player moveRight(Player p) throws MapControllerException {
        Map map = getCurrentGame().getMap();
        Point row = p.getCoordinates();

        if (row.x + 1 == map.getWidth()) {
            throw new MapControllerException("Can not move Player to this Tile "
                    + "because that space is outside "
                    + "the maps bounds.");
        }

        row.x++;
        p.setCoordinates(row);

        return p;

    }

    public static Tiles getTile(Point p) {
        Tiles[][] m = superherogame.SuperHeroGame.getCurrentGame().getMap().getMap();
        return m[p.x][p.y];
    }

}
