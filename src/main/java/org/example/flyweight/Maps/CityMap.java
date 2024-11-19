package org.example.flyweight.Maps;
import org.example.flyweight.Map;
import org.example.flyweight.Tile;
import org.example.flyweight.Tiles.BuildingTile;
import org.example.flyweight.Tiles.ForestTile;
import org.example.flyweight.Tiles.RoadTile;

import java.util.Random;


public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);
        switch (tileType) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            default: return new BuildingTile();
        }
    }
}
