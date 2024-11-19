package org.example.flyweight;

import javafx.scene.image.Image;

import java.util.HashMap;

public class TileGraphicFactory {
    private static final HashMap<String, Image> tileGraphics = new HashMap<>();

    public static Image getTileGraphic(String tileType) {
        if (!tileGraphics.containsKey(tileType)) {
            switch (tileType) {
                case "Road":
                    tileGraphics.put(tileType, new Image(TileGraphicFactory.class.getResource("/images/road.jpg").toExternalForm()));
                    break;
                case "Forest":
                    tileGraphics.put(tileType, new Image(TileGraphicFactory.class.getResource("/images/forest.jpg").toExternalForm()));
                    break;
                case "Building":
                    tileGraphics.put(tileType, new Image(TileGraphicFactory.class.getResource("/images/building.jpg").toExternalForm()));
                    break;
                case "Swamp":
                    tileGraphics.put(tileType, new Image(TileGraphicFactory.class.getResource("/images/swamp.jpg").toExternalForm()));
                    break;
                case "Water":
                    tileGraphics.put(tileType, new Image(TileGraphicFactory.class.getResource("/images/water.jpg").toExternalForm()));
                    break;
            }
        }
        return tileGraphics.get(tileType);
    }
}