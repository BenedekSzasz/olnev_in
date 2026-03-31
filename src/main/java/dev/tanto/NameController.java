package dev.tanto;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class NameController {



    @FXML
    private Label countNameLabel;

    @FXML
    private TextArea huNameField;

    @FXML
    private TextArea itNameField;

    @FXML
    void initialize(){
        System.out.println("Töltés....");
        Integer size = App.nameDictList.size();
        countNameLabel.setText(size.toString());
    }

    @FXML
    void onClickBackButton(ActionEvent event) throws IOException {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println(App.nameDictList.get(0).getHunName());
        String huName = huNameField.getText();
        for(NameDict nameDict : App.nameDictList) {
            if(huName.equals(nameDict.getHunName())) {
                itNameField.setText(nameDict.getItName());
            }
            }
        }
    }
