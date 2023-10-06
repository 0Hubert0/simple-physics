package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 900, 600);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

    