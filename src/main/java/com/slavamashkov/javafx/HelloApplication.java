package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Buttons test.");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        response = new Label("Push a button");
        Button btnA = new Button("A");
        Button btnB = new Button("B");

        btnA.setOnAction(actionEvent -> response.setText("Pushed A"));
        btnB.setOnAction(actionEvent -> response.setText("Pushed B"));

        rootNode.getChildren().addAll(btnA, btnB, response);

        myStage.show();
    }
}