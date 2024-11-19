package org.example.flyweight.Maps;

import org.example.flyweight.Map;
import org.example.flyweight.Tile;
import org.example.flyweight.Tiles.ForestTile;
import org.example.flyweight.Tiles.SwampTile;
import org.example.flyweight.Tiles.WaterTile;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);
        switch (tileType) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            default: return new ForestTile();
        }
    }
}