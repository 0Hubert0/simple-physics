package com.example;

import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int amountOfCircles = 50;
        List<Ball> circles = new LinkedList<>();

        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 1500, 950);
        scene.setFill(Color.BLACK);

        for (int i = 0; i < amountOfCircles; i++) {
            Ball b = new Ball(Math.random()*(scene.getWidth()-100)+50, Math.random()*(scene.getWidth()-100)+50);
            b.setFill(Color.BEIGE);
            for (int j = 0; j < circles.size(); j++) {
                if(b.checkColision(circles.get(j))){
                    
                }
            }
            circles.add(b);
            root.getChildren().add(b);
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

    
