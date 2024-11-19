package org.example.flyweight.Tiles;

import org.example.flyweight.Tile;

public class RoadTile extends Tile {
    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public void action() {
        // Road-specific action
    }
}