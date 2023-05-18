package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import com.example.test_javafx.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {
    @FXML
    public AnchorPane rootPane;
    public TextField userName;
    public TextField pass;

    Navigation navigation = new Navigation();
    User u = new User();
    public void dirictor(ActionEvent actionEvent) {
    }

    public void te(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane,navigation.TEACHER_FXML);
    }

    public void login(ActionEvent actionEvent) {
        if((userName.getText().equals(u.getUsername()))&&(pass.getText().equals(u.getPassword()))){
            navigation.navigateTo(rootPane,navigation.MANGER_FXML);
        }
    }
}
