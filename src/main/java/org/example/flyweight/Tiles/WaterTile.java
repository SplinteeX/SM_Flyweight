package org.example.flyweight.Tiles;

import org.example.flyweight.Tile;

public class WaterTile extends Tile {
    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action() {
        // Water-specific action
    }
}