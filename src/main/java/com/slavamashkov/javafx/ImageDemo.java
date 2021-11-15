package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;

public class ImageDemo extends Application {
    private static final int HEIGHT = 200;
    private static final int WIDTH = 200;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        stage.setTitle("Display an image");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);

        Scene imageScene = new Scene(rootNode, HEIGHT, WIDTH);
        stage.setScene(imageScene);

        ImageView hourglassIV = new ImageView("file:///D:/JavaProjects/JavaFX/src/main/resources/images/hourglass.png");

        //Label hourglassLabel = new Label("Hourglass", hourglassIV);

        Button hourglassButton = new Button("Hourglass", hourglassIV);
        hourglassButton.setMinHeight(hourglassIV.getImage().getHeight());
        hourglassButton.setMinWidth(hourglassIV.getImage().getWidth());

        hourglassButton.setOnAction(actionEvent ->
            {
                hourglassButton.setContentDisplay(ContentDisplay.TEXT_ONLY);
            }
        );

        rootNode.getChildren().add(hourglassButton);

        stage.show();
    }
}
