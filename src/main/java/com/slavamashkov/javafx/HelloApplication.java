package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("JavaFX Skeleton.");

        FlowPane rootNode = new FlowPane();
        Label myLabel = new Label("This is a JavaFX label");

        rootNode.getChildren().add(myLabel);

        Scene myScene = new Scene(rootNode, 300, 200);

        myStage.setScene(myScene);
        myStage.show();
    }
}