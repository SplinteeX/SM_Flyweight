package org.example.flyweight.Tiles;

import org.example.flyweight.Tile;

public class ForestTile extends Tile {
    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public void action() {
        // Forest-specific action
    }
}