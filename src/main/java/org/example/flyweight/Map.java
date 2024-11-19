package org.example.flyweight;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] grid;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new Tile[width][height];
        generateMap();
    }

    protected abstract Tile createTile();

    private void generateMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = createTile();
            }
        }
    }

    public void render(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double tileWidth = canvas.getWidth() / width;
        double tileHeight = canvas.getHeight() / height;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Image tileGraphic = grid[i][j].getGraphic();
                gc.drawImage(tileGraphic, i * tileWidth, j * tileHeight, tileWidth, tileHeight);
            }
        }
    }
}