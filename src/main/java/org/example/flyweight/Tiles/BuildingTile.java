package org.example.flyweight.Tiles;

import org.example.flyweight.Tile;

public class BuildingTile extends Tile {
    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public void action() {
        // Building-specific action
    }
}