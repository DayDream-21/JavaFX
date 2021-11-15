package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
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
    public void start(Stage stage) {
        stage.setTitle("Display an image");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);

        Scene imageScene = new Scene(rootNode, HEIGHT, WIDTH);
        stage.setScene(imageScene);

        ImageView hourglassIV = new ImageView("file:///D:/JavaProjects/JavaFX/src/main/resources/images/hourglass.png");
        ImageView check_markIV = new ImageView("file:///D:/JavaProjects/JavaFX/src/main/resources/images/check_mark.png");

        //Label hourglassLabel = new Label("Hourglass", hourglassIV);

        ToggleButton toggleButton = new ToggleButton("Hourglass", hourglassIV);
        toggleButton.setMinHeight(hourglassIV.getImage().getHeight());
        toggleButton.setMinWidth(hourglassIV.getImage().getWidth());

        toggleButton.setOnAction(actionEvent ->
            {
                if (toggleButton.isSelected()) {
                    toggleButton.setGraphic(check_markIV);
                } else {
                    toggleButton.setGraphic(hourglassIV);
                }
            }
        );

        rootNode.getChildren().add(toggleButton);

        stage.show();
    }
}
