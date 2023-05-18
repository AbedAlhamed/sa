package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class AdminController {
    @FXML
    private AnchorPane anchorPane;
    Navigation navigation = new Navigation();
    public void CreatT(ActionEvent actionEvent) {
    }

    public void CreatC(ActionEvent actionEvent) {
    }

    public void EditT(ActionEvent actionEvent) {
    }

    public void EdetC(ActionEvent actionEvent) {
    }

    public void adminName(MouseEvent mouseEvent) {
    }

    public void logout(ActionEvent actionEvent) {
        navigation.navigateTo(anchorPane,navigation.LOGOUT);
    }
}
