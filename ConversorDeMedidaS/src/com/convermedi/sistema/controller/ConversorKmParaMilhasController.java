package com.convermedi.sistema.controller;

import com.convermedi.sistema.app.ConversorKmParaMilhas;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConversorKmParaMilhasController {

    @FXML
    private TextField textFieldKm;

    @FXML
    private TextField textFieldMilhas;

    @FXML
    private void converterKmParaMilhas() {
        double km = Double.parseDouble(textFieldKm.getText());
        double milhas = ConversorKmParaMilhas.converter(km);
        textFieldMilhas.setText(String.valueOf(milhas));
    }
}
