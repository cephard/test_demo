package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label clickmelabel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onClickMeButtonClick() {
        clickmelabel.setText("Hello World");
    }

    @FXML
    protected void onClickMebtnOp() {
        clickmelabel.setText("Hello World");
    }

}