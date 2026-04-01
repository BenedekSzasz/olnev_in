package dev.tanto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        System.out.println("névjegy...");
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println("Keresés");
        App.setRoot("nameScene");
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }    

}