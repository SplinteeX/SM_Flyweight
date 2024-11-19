package org.example.flyweight;

import javafx.scene.image.Image;

public abstract class Tile {
    public abstract String getType();

    public Image getGraphic() {
        return org.example.flyweight.TileGraphicFactory.getTileGraphic(getType());
    }

    public abstract void action();
}