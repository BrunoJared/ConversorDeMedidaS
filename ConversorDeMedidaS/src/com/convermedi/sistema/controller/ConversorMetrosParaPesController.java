package com.convermedi.sistema.controller;

import com.convermedi.sistema.app.ConversorMetrosParaPes;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConversorMetrosParaPesController {

    @FXML
    private TextField textFieldMetros;

    @FXML
    private TextField textFieldPes;

    @FXML
    private void converterMetrosParaPes() {
        double metros = Double.parseDouble(textFieldMetros.getText());
        double pes = ConversorMetrosParaPes.converter(metros);
        textFieldPes.setText(String.valueOf(pes));
    }
}
