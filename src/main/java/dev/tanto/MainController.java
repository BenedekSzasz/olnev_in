package dev.tanto;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) throws IOException {
        System.out.println("Névjegy...");
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) throws IOException {
        System.out.println("Keresés...");
        App.setRoot("nameScene");
    }

}
