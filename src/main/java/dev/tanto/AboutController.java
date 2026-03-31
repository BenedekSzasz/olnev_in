package dev.tanto;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void onClickBackButton(ActionEvent event) throws IOException {
        App.setRoot("mainScene");
    }

}
