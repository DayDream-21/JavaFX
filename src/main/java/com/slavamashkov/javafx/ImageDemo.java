package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;

public class ImageDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Display an image");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);

        Scene imageScene = new Scene(rootNode, 300, 200);
        stage.setScene(imageScene);

        File hourglassLocation = new File("D:\\JavaProjects\\JavaFX\\src\\main\\resources\\images\\hourglass.png");

        ImageView hourglassIV = new ImageView(new Image(hourglassLocation.toURI().toURL().toString()));

        rootNode.getChildren().add(hourglassIV);

        stage.show();
    }
}
