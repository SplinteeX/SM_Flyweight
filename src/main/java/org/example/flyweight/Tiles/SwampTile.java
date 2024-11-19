package org.example.flyweight.Tiles;

import org.example.flyweight.Tile;

public class SwampTile extends Tile {
    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public void action() {
        // Swamp-specific action
    }
}