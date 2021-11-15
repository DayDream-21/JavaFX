package com.slavamashkov.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws MalformedURLException {
        myStage.setTitle("Text field test.");
        myStage.setFullScreen(true);
        Label sumSignLabel = new Label(" + ");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        File checkMark = new File("D:\\JavaProjects\\JavaFX\\src\\main\\resources\\images\\check_mark.png");

        ImageView checkMarkIV = new ImageView(new Image(checkMark.toURI().toURL().toString()));

        Button equalsButton = new Button(" = ");

        TextField aTextField = new TextField();
        TextField bTextField = new TextField();
        TextField resultTextField = new TextField();
        aTextField.setMaxWidth(40);
        bTextField.setMaxWidth(40);
        resultTextField.setMaxWidth(80);

        equalsButton.setOnAction(actionEvent ->
                {
                    resultTextField.setText(String.valueOf(Integer.parseInt(aTextField.getText()) + Integer.parseInt(bTextField.getText())));
                    rootNode.getChildren().add(checkMarkIV);
                }
        );

        rootNode.getChildren().addAll(aTextField, sumSignLabel, bTextField, equalsButton, resultTextField);

        myStage.show();
    }
}