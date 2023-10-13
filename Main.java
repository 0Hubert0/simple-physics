package com.example;

import java.util.LinkedList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int amountOfCircles = 50;
        boolean[] isPressed = new boolean[1];
        Ball[] chosen = new Ball[1];
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
            b.setOnMousePressed(event -> {
                chosen[0] = b;
                isPressed[0] = true;
            });
            circles.add(b);
            root.getChildren().add(b);
        }

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), event -> {
            for (int i = 0; i < circles.size(); i++) {
                Ball b = circles.get(i);
                b.setCenterX(b.getCenterX()+b.getVx());
                b.setCenterY(b.getCenterY()+b.getVy());
            }
        }));

        timeline.setCycleCount(-1);
        timeline.play();

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

    
