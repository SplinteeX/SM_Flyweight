package org.example.flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.flyweight.Maps.CityMap;
import org.example.flyweight.Maps.WildernessMap;

import java.util.Random;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Canvas canvas = new Canvas(500, 500);

        Map map;
        Random rand = new Random();
        if (rand.nextBoolean()) {
            map = new CityMap(5, 5);
        } else {
            map = new WildernessMap(5, 5);
        }

        map.render(canvas);
        root.getChildren().add(canvas);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("RPG Map Generator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}